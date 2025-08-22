package com.games.projeto.dto;

import com.games.projeto.entities.Game;
import com.games.projeto.projections.GameMinProjection;

public class GameMinDTO { //limitar os campos para disponibilizar para o front

    private Long id;
    private String title; //titulo
    private Integer year; //ano
    private String imgUrl; //imagem url
    private  String shortDescription; //descrição curta

    GameMinDTO(){

    }
    public GameMinDTO(GameMinProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        year = projection.getYear();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
    }

    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
