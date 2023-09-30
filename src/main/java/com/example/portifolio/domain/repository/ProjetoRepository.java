package com.example.portifolio.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.portifolio.domain.model.Projeto;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Long>{
    
}
