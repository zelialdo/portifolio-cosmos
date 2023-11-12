package com.example.portifolio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.portifolio.domain.dto.ProducaoMinDto;
import com.example.portifolio.repository.ProducaoRepository;

@Service
public class ProducaoService {

    @Autowired
    private ProducaoRepository projetoRepository;

    public List<ProducaoMinDto> findAll() {
        var result = projetoRepository.findAll();
        var dto = result.stream().map(x -> new ProducaoMinDto(x)).toList();
        return dto;
    }
}
