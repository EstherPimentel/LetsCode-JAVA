package Exercicio8GenericsSolid;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Stock stock = Stock.getInstance();
        Book book = new Book("1984", 210, "Orwel", "Rocco", "Ficção", "Política");
        book.setAdultContent(true);
        stock.addItem(book);
        Purchase buy = new Purchase(new Client("Esther", "1111111", "1213312112", LocalDate.of(1987, 9, 28)));
        buy.addItem(book);
        buy.execute();
        System.out.println(stock.count(Product.class));
        System.out.println(Cashier.getInstance().getBalance());
    }
}
