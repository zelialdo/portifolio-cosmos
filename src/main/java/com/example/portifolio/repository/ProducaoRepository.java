package com.example.portifolio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.portifolio.domain.dto.ProducaoDto;
import com.example.portifolio.domain.model.Producao;
import com.example.portifolio.domain.model.TagEnum;

@Repository
public interface ProducaoRepository extends JpaRepository<Producao, Long>{

    ProducaoDto save(ProducaoDto producaoExistente);

    List<Producao> findByTagEnum(TagEnum tagEnum);
    
}
