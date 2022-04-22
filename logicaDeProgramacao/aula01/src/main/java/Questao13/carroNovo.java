package Questao13;

import java.util.Scanner;

/*
O custo ao consumidor de um carro novo é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos. Supondo que a porcentagem do distribuidor seja de 28% e os impostos de 45%. Escreva um programa que leia o custo de fábrica e informe o custo ao consumidor final.

 */
public class carroNovo {
    public static void main(String[] args) {
        double distribuidor = 28;
        double imposto = 45;
        double custoConsumidor;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o custo de fábrica: ");
        double custoFabrica = scanner.nextDouble();

        double valorDist = custoFabrica + (custoFabrica * distribuidor / 100);
        double valorImp = custoFabrica + (custoFabrica * imposto / 100);

        custoConsumidor = custoFabrica + valorDist + valorImp;

        System.out.println("O custo do carro ao consumidor é: " + custoConsumidor);
    }
}
