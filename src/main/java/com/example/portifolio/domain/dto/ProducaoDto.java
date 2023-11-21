package com.example.portifolio.domain.dto;

import org.springframework.beans.BeanUtils;

import com.example.portifolio.domain.model.Producao;

public class ProducaoDto {

    private Long id;
    private String nome;
    private int ano;
    private String descricao;
    private String tipoProducao;
    private String tag;
    private String objetivo;
    private String docente;
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

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getTipoProducao() {
        return this.tipoProducao;
    }

    public void setTipoProducao(String tipoProducao) {
        this.tipoProducao = tipoProducao;
    }

    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getObjetivo() {
        return this.objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getDocente() {
        return this.docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
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
