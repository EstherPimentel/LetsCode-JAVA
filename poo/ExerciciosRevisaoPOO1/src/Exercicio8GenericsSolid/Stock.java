package Exercicio8GenericsSolid;

import java.nio.file.DirectoryNotEmptyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Stock implements IProductCollection{
    private HashMap<Long,Product> products;
    private static Stock instance;

    private Stock(Product... items) throws Exception {
        products = new HashMap<>();
        addItem(items);
    }

    public static Stock getInstance() throws Exception{
        if(instance == null){
            instance = new Stock();
        }
        return instance;
    }

    public Product getItem(long id) throws Exception {
        if(!products.containsKey(id)) {
            throw new Exception("Product not Found!");
        }
        return products.get(id);
    }

    public void addItem(Product... items) throws Exception {
        for(Product product : items){
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
        if(!products.containsKey(item.getId())) {
            throw new Exception("Product not Found!");
        }
        products.replace(item.getId(), item);
    }

    public <T extends Product> List<T> getList(Class <T> c) {
        List<T> items = new ArrayList<>();
        for(Product item : products.values()){
            if(c.isInstance(item)) {
                items.add((T)item);
            }
        }
        return items;
    }

    public List<Product> getList(){
        return getList(Product.class);
    }

    public <T extends Product> int count (Class <T> c) {
        int count = 0;
        for(Product item : products.values()){
            if(c.isInstance(item)){
                count++;
            }
        }
        return count;
    }

    public int count(){
        return products.size();
    }

}
