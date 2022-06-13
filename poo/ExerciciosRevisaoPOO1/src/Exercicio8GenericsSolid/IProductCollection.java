package Exercicio8GenericsSolid;

public interface IProductCollection {

    public Product getItem(long id) throws Exception;

    public void addItem(Product... items) throws Exception;

    public void removeItem(long id) throws Exception;

    public void removeItem(Product item) throws Exception;

    public void setItem(Product item) throws Exception;
}
