package Exercicio8GenericsSolid;

import Exercicio7InterfaceAbstracao.EnumTipoCarta;

public abstract class Product {

    private String nome;
    private long id;
    private static long uniqueId = 0;
    private double price;
    private boolean adultContent;

    protected Product(String nome, double price) {
        this.nome = nome;
        this.price = price;
        id = idGenerator();
        adultContent = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    private static long idGenerator() {
        return ++uniqueId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws Exception {
        if(price <= 0) {
            throw new Exception("Product cannot negative price!");
        }
        this.price = price;
    }

    public boolean hasAdultContent() {
        return adultContent;
    }

    public void setAdultContent(boolean adultContent) {
        this.adultContent = adultContent;
    }

}
