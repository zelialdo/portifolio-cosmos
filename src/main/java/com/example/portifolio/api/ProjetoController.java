package com.example.portifolio.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.portifolio.domain.dto.ProducaoMinDto;
import com.example.portifolio.services.ProducaoService;

@RestController
@RequestMapping(value = "/projetos")
public class ProjetoController {

    @Autowired
    private ProducaoService projetoService;

    @GetMapping
    public List<ProducaoMinDto> findAll() {
        List<ProducaoMinDto> result = projetoService.findAll();
        return result;
    }

}