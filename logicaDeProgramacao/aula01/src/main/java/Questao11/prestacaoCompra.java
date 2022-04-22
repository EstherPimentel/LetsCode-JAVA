package Questao11;

import java.util.Scanner;

/*
Uma loja está vendendo seus produtos em 5 prestações sem juros. Faça um programa que insira o valor total de uma compra e o valor das prestações.

 */
public class prestacaoCompra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor total da compra:");
        double valor = scanner.nextDouble();

        double prestacoes = valor / 5;
        System.out.println("O valor das prestações é de: " + prestacoes);
    }
}
