package com.example.portifolio.domain.dto;

import com.example.portifolio.domain.model.Producao;

public class ProducaoMinDto {

    private Long id;
    private String nome;
    private String descricao;
    private String tipoProducao;
    private String docente;

    public ProducaoMinDto() {
    }

    public ProducaoMinDto(Producao entity) {
        id = entity.getId();
        nome = entity.getNome();
        descricao = entity.getDescricao();
        tipoProducao = entity.getTipoProducao();
        docente = entity.getDocente();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTipoProducao() {
        return tipoProducao;
    }

    public String getDocente() {
        return docente;
    }

}
