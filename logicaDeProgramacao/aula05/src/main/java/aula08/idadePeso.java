package aula08;

import java.util.Scanner;

/*
Faça um programa que receba a idade e o peso de sete pessoas. Calcule e mostre:
A quantidade de pessoas com mais de 90 quilos;
A média das idades das sete pessoas;

 */
public class idadePeso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idadeT = 0;
        double peso = 0;
        int[] pessoas = new int[7];
        int count = 0;

        for(int i = 0; i< pessoas.length; i++){
            System.out.println("Informe sua idade: ");
            int idade = scanner.nextInt();

            idadeT+= idade;

            System.out.println("Informe seu peso: ");
            peso = scanner.nextDouble();

            if(peso > 90){
                count++;
            }
        }
        System.out.println("O número de pessoas com mais de 90Kg é: " + count + " \n A média das idades é: " + idadeT / 7);

    }
}
