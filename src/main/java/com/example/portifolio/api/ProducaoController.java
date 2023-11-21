package com.example.portifolio.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.portifolio.domain.dto.ProducaoDto;
import com.example.portifolio.domain.dto.ProducaoMinDto;
import com.example.portifolio.services.ProducaoService;

@RestController
@RequestMapping(value = "/producoes")
public class ProducaoController {

    @Autowired
    private ProducaoService producaoService;

    @GetMapping
    public List<ProducaoMinDto> findAll() {
        List<ProducaoMinDto> result = producaoService.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public ProducaoDto findById(@PathVariable Long id) {
        ProducaoDto result = producaoService.findById(id);
        return result;
    }

}