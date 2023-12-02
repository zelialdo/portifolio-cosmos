package com.example.portifolio.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.portifolio.domain.dto.ProducaoDto;
import com.example.portifolio.domain.dto.ProducaoMinDto;
import com.example.portifolio.domain.model.Producao;
import com.example.portifolio.services.ProducaoService;

@RestController
@RequestMapping(value = "/producoes")
public class ProducaoController {

    @Autowired
    private ProducaoService producaoService;

    @GetMapping(value = "/card")
    public List<ProducaoMinDto> findAll() {
        List<ProducaoMinDto> result = producaoService.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public ProducaoDto findById(@PathVariable Long id) {
        ProducaoDto result = producaoService.findById(id);
        return result;
    }

    public ProducaoController(ProducaoService producaoService) {
        this.producaoService = producaoService;
    }

    @PostMapping
    public ResponseEntity<String> registrarProducao(@RequestBody Producao producao) {
        try {
            Producao novaProducao = producaoService.registrarProducao(producao);
            return new ResponseEntity<>("Produção registrada com sucesso. ID: " + novaProducao.getId(), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Erro ao registrar a produção: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteProducao(@PathVariable Long id) {
        if (!producaoService.existsById(id)) {
            return ResponseEntity.noContent().build();
        }

        producaoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Producao> editarProducao(@PathVariable Long id, @RequestBody Producao producao){
        Producao producaoExistente = producaoService.BuscarPorId(id);
        if (producaoExistente == null){
            return ResponseEntity.notFound().build();
        }

        producaoExistente.setTitulo(producao.getTitulo());
        producaoExistente.setAno(producao.getAno());
        producaoExistente.setDescricao(producao.getDescricao());
        producaoExistente.setInstituicao(producao.getInstituicao());
        producaoExistente.setLink(producao.getLink());

        Producao producaoAtualizada = producaoService.salvarAlteracao(producaoExistente);

        return ResponseEntity.ok(producaoAtualizada);
    }
}
    