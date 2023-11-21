package com.example.portifolio.services;

import java.lang.reflect.Field;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.portifolio.domain.dto.ProducaoDto;
import com.example.portifolio.domain.dto.ProducaoMinDto;
import com.example.portifolio.domain.model.Producao;
import com.example.portifolio.repository.ProducaoRepository;

@Service
public class ProducaoService {

    @Autowired
    private ProducaoRepository producaoRepository;

    public ProducaoService(ProducaoRepository producaoRepository) {
        this.producaoRepository = producaoRepository;
    }

  
    @Transactional(readOnly = true)
    public List<ProducaoMinDto> findAll() {
        var result = producaoRepository.findAll();
        var dto = result.stream().map(x -> new ProducaoMinDto(x)).toList();
        return dto;
    }

    @Transactional(readOnly = true)
    public ProducaoDto findById(Long id) {
        Producao result = producaoRepository.findById(id).get();
        ProducaoDto dto = new ProducaoDto(result);
        return dto;
    }

    public Producao registrarProducao(Producao producao) {
        validarCamposObrigatorios(producao);
        return producaoRepository.save(producao);
    }

    private void validarCamposObrigatorios(Producao producao) {
        Class<?> clazz = producao.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);

            // Exclui a validação do campo 'id'
            if (field.getName().equals("id")) {
                continue;
            }

            // Verifica se o campo não é do tipo String e está nulo
            if (!field.getType().equals(String.class)) {
                try {
                    if (field.get(producao) == null) {
                        throw new IllegalArgumentException("O campo '" + field.getName() + "' é obrigatório.");
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace(); // Lidar com exceção conforme necessário
                }
            }
        }
    }
}
