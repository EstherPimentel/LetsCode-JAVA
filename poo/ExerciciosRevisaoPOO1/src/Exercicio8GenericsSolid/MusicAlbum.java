package Exercicio8GenericsSolid;

import java.util.Arrays;
import java.util.List;

public class MusicAlbum extends Product implements IGenrerable{
    private List<String> bands;
    private List<String> genres;
    private List<String> labels;

    public MusicAlbum(String nome, double price, String... bands) {
        super(nome, price);
        setBands(bands);
    }

    public List<String> getBands() {
        return bands;
    }

    public void setBands(String... bands) {
        this.bands = Arrays.asList(bands);
    }

    @Override
    public List<String> getGenres() {
        return genres;
    }

    @Override
    public void setGenres(String... genres) {
        this.genres = Arrays.asList(genres);
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(String... labels) {
        this.labels = Arrays.asList(labels);
    }
}
