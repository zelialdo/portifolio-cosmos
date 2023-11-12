package com.example.portifolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.portifolio.domain.model.Producao;

@Repository
public interface ProducaoRepository extends JpaRepository<Producao, Long>{
    
}
