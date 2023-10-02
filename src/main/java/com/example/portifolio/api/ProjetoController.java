package com.example.portifolio.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.portifolio.domain.dto.ProjetoMinDto;
import com.example.portifolio.services.ProjetoService;

@RestController
@RequestMapping(value = "/projetos")
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    @GetMapping
    public List<ProjetoMinDto> findAll() {
        List<ProjetoMinDto> result = projetoService.findAll();
        return result;
    }

}