package com.example.portifolio.domain.model;

public enum TagEnum {
    TEXTO("texto"),
    VIDEO("video"),
    PODCAST("podcast"),
    OUTRO("outro");

    private final String name;

    TagEnum(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
    
}
