package Exercicio8GenericsSolid;

import java.util.Arrays;
import java.util.List;

public class Game extends Product implements IGenrerable{
    private String distribution;
    private List<String> genres;
    private String studio;

    public Game(String nome, double price, String distribution, String studio, String... genres) {
        super(nome, price);
        this.distribution = distribution;
        setGenres(genres);
        this.studio = studio;
    }

    @Override
    public List<String> getGenres() {
        return genres;
    }

    @Override
    public void setGenres(String... genres) {
        this.genres = Arrays.asList(genres);
    }

    public String getDistribution() {
        return distribution;
    }

    public void setDistribution(String distribution) {
        this.distribution = distribution;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
}

