package com.example.portifolio.domain.dto;

import org.springframework.beans.BeanUtils;

import com.example.portifolio.domain.model.Producao;
import com.example.portifolio.domain.model.TagEnum;


public class ProducaoDto {

    private Long id;
    private String titulo;
    private int ano;
    private TagEnum tagEnum;
    private String descricao;

    public TagEnum getTagEnum() {
        return this.tagEnum;
    }

    public void setTagEnum(TagEnum tagEnum) {
        this.tagEnum = tagEnum;
    }
    private String instituicao;
    private String link;

    public ProducaoDto() {
    }

    public ProducaoDto(Producao entity) {
        BeanUtils.copyProperties(entity, this);
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String nome) {
        this.titulo = nome;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public String getInstituicao() {
        return this.instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }

}
