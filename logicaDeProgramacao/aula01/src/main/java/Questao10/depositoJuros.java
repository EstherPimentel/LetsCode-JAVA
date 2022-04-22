package Questao10;

import java.util.Scanner;

/*
Crie um programa que receba um valor que foi depositado e logo em seguida o valor com rendimento após 1 mês. Considere a taxa de juros da poupança em 0,70% a.m.

 */
public class depositoJuros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor depositado: ");
        double valorDep = scanner.nextDouble();

        double rend = (valorDep * 0.70) / 100;
        double valorRend = valorDep + rend;
        double valorFinal = Math.pow(valorRend, 1);

        System.out.println("O valor com rendimento é: " + valorFinal);
    }
}
