package com.example.portifolio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.portifolio.domain.dto.ProjetoMinDto;
import com.example.portifolio.domain.model.Projeto;
import com.example.portifolio.repository.ProjetoRepository;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository projetoRepository;

    public List<ProjetoMinDto> findAll() {
        var result = projetoRepository.findAll();
        var dto = result.stream().map(x -> new ProjetoMinDto(x)).toList();
        return dto;
    }
}
