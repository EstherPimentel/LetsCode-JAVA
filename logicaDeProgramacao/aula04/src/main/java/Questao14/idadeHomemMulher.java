package Questao14;

import java.util.Scanner;

/*
Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres
(considere que as idades dos homens serão sempre diferentes entre si,
bem como as das mulheres).

Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova,
e o produto das idades do homem mais novo com a mulher mais velha.

 */
public class idadeHomemMulher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira idades diferentes de 2 homens: ");
        int idadeH1 = scanner.nextInt();
        int idadeH2 = scanner.nextInt();

        while(idadeH1 == idadeH2){
            System.out.println("Insira idades diferentes");
            idadeH1 = scanner.nextInt();
            idadeH2 = scanner.nextInt();
        }

        System.out.println("Insira idades diferentes de 2 mulheres: ");
        int idadeM1 = scanner.nextInt();
        int idadeM2 = scanner.nextInt();

        while(idadeM1 == idadeM2){
            System.out.println("Insira idades diferentes");
            idadeM1 = scanner.nextInt();
            idadeM2 = scanner.nextInt();
        }
        int a = Math.max(idadeH1, idadeH2) + Math.min(idadeM1, idadeM2);
        int b = Math.min(idadeH1, idadeH2) * Math.max(idadeM1, idadeM2);

        System.out.println("A soma da idade do homem mais velho e da mulher mais nova é: " + a + "\n O produto do homem mais novo com a mulher mais velha é: " + b);
    }
}
