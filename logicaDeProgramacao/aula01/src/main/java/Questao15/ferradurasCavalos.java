package Questao15;

import java.util.Scanner;

/*
Escreva um programa para calcular a quantidade de ferraduras necessárias para equipar todos os cavalos comprados para um haras. A informação de cavalos comprados deve ser informada pelo usuário.

 */
public class ferradurasCavalos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe quantos cavalos você tem: ");
        int cavalos = scanner.nextInt();

        int totalFerraduras = cavalos * 4;

        System.out.println("O total de ferraduras que você precisa é: " + totalFerraduras);
    }
}
