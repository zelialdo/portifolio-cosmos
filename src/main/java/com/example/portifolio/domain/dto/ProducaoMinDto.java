package com.example.portifolio.domain.dto;

import com.example.portifolio.domain.model.Producao;
import com.example.portifolio.domain.model.TagEnum;

public class ProducaoMinDto {

    private Long id;
    private String titulo;
    private String instituicao; 
    private TagEnum tagEnum;
    private int ano;

    public ProducaoMinDto() {
    }

    public ProducaoMinDto(Producao entity) {
        id = entity.getId();
        titulo = entity.getTitulo();
        instituicao = entity.getInstituicao();
        tagEnum = entity.getTagEnum();  
        ano = entity.getAno();     
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setTitulo(String nome) {
        this.titulo = nome;
    }

    public String getInstituicao() {
        return this.instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public TagEnum getTagEnum() {
        return this.tagEnum;
    }

    public void setTagEnum(TagEnum tagEnum) {
        this.tagEnum = tagEnum;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }
}
