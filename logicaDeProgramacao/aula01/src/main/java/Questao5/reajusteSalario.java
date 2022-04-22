package Questao5;

import java.util.Scanner;

/*
Crie um programa que com base em um salário de um funcionário, reajusta o salário em 7% e mostra o valor antes do reajuste e após.
 */
public class reajusteSalario {
    public static void main(String[] args) {
        double valorObtido;
        double porcentagem;
        double valorTotal;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do seu salário: ");
        valorObtido= scanner.nextDouble();

        porcentagem = (valorObtido * 7) / 100;
        valorTotal = valorObtido + porcentagem;

        System.out.println("Seu salário anterior é: " + valorObtido);
        System.out.println("Seu salário atual é: " + valorTotal);
    }
}
