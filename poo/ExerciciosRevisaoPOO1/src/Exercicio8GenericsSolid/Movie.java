package Exercicio8GenericsSolid;

import java.util.Arrays;
import java.util.List;

public class Movie extends Product implements IGenrerable{
    private String studio;
    private String director;
    private List<String> genres;
    private List<String> producers;

    public Movie(String nome, double price, String studio, String director, String... producers) {
        super(nome, price);
        this.studio = studio;
        this.director = director;
        setProducers(producers);
    }

    @Override
    public List<String> getGenres() {
        return genres;
    }

    @Override
    public void setGenres(String... genres) {
        this.genres = Arrays.asList(genres);
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<String> getProducers() {
        return producers;
    }

    public void setProducers(String... producers) {
        this.producers = Arrays.asList(producers);
    }
}
