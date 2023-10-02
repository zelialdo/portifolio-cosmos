package com.example.portifolio.domain.dto;

import com.example.portifolio.domain.model.Projeto;

public class ProjetoMinDto {

    private Long id;
    private String tema;
    private String instituicao;
    private String mentor;
    private String anoDeRealizacao;

    public ProjetoMinDto() {
    }

    public ProjetoMinDto(Projeto entity) {
        id = entity.getId();
        tema = entity.getTema();
        instituicao = entity.getInstituicao();
        mentor = entity.getMentor();
        anoDeRealizacao = entity.getAnoDeRealizacao();
    }

    public Long getId() {
        return id;
    }

    public String getTema() {
        return tema;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public String getMentor() {
        return mentor;
    }

    public String getAnoDeRealizacao() {
        return anoDeRealizacao;
    }

    
}
