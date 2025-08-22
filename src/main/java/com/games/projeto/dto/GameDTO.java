package com.games.projeto.dto;

import com.games.projeto.entities.Game;
import org.springframework.beans.BeanUtils;

public class GameDTO {//controlar e padronizar o codigo e evitar representação ciclicas

    private Long id;
    private String title; //titulo
    private Integer year; //ano
    private String genre;//genero
    private String platform; //plataforma
    private double score;
    private String imgUrl; //imagem url
    private  String shortDescription; //descrição curta
    private String longDescription;

    public GameDTO() {
    }

    public GameDTO(Game entity) {
        BeanUtils.copyProperties(entity,this); // copia objetos grandes que tem os mesmos atributos
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
}
