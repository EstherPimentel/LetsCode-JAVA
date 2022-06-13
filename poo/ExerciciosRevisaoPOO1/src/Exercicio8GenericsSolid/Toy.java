package Exercicio8GenericsSolid;

public class Toy extends Product{
    private String type;

    public Toy(String nome, double price, String type) {
        super(nome, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
