package Exercicio8GenericsSolid;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;

public class Purchase implements IProductCollection {
    private HashMap<Long, Product> products;
    private Client client;

    public Purchase(Client client) {
        products = new HashMap<>();
        this.client = client;
    }

    public Product getItem(long id) throws Exception {
        if(!products.containsKey(id)) {
            throw new Exception("Product not Found!");
        }
        return products.get(id);
    }

    public void addItem(Product... items) throws Exception {
        for(Product product : items){
            if (product.hasAdultContent() && Period.between(client.getBirthDate(), LocalDate.now()).getYears() < 18) {
                throw new Exception("Client is minor and cannot buy this product!");
            }
            if(products.containsKey(product.getId())) {
                throw new Exception("Product already added!");
            }
            products.put(product.getId(), product);
        }
    }

    public void removeItem(long id) throws Exception {
        if(!products.containsKey(id)) {
            throw new Exception("Product not Found!");
        }
        products.remove(id);
    }

    public void removeItem(Product item) throws Exception{
        if(!products.containsKey(item.getId())) {
            throw new Exception("Product not Found!");
        }
        products.remove(item.getId());
    }

    @Override
    public void setItem(Product item) throws Exception {
        if (item.hasAdultContent() && Period.between(client.getBirthDate(), LocalDate.now()).getYears() < 18) {
            throw new Exception("Client is minor and cannot buy this product!");
        }
        if(!products.containsKey(item.getId())) {
            throw new Exception("Product not Found!");
        }
        products.replace(item.getId(), item);
    }

    //padrão de projeto command
    public void execute() throws Exception {
        double sum = 0;
        double sumBook = 0;
        for(Product product : products.values()){
            Stock.getInstance().removeItem(product.getId());
            sum += product.getPrice();
            if (product instanceof Book) {
                sumBook += product.getPrice();
            }
        }
        Cashier.getInstance().addCash((sumBook >= 200) ? sum * 0.85 : sum);
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
