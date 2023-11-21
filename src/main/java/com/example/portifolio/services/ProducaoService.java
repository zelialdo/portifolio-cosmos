package com.example.portifolio.services;

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
}
