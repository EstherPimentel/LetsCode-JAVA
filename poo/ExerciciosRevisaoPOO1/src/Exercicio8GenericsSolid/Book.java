package Exercicio8GenericsSolid;

import java.util.Arrays;
import java.util.List;

public class Book extends Product implements IGenrerable {

    private List<String> genres;
    private String writer;
    private String publisher;


    public Book(String nome, double price, String writer, String publisher, String... genres) {
        super(nome, price);
        setGenres(genres);
        this.writer = writer;
        this.publisher = publisher;
    }

    @Override
    public List<String> getGenres() {
        return genres;
    }

    @Override
    public void setGenres(String... genres) {
        this.genres = Arrays.asList(genres);
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
