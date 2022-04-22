package Questao12;

import java.util.Scanner;

/*
Faça um programa que receba o preço de custo do produto e exiba o valor de venda.
O valor de venda receberá um acréscimo de acordo com o percentual informado pelo usuário.

 */
public class percentualVenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor do produto: ");
        double precoCusto = scanner.nextDouble();
        System.out.println("Digite o percentual de acréscimo no valor do produto: ");
        double perc = scanner.nextDouble();

        double juros = (precoCusto * perc) / 100;
        double precoVenda = precoCusto + juros;

        System.out.println("O valor de venda é: " + precoVenda);
    }
}
