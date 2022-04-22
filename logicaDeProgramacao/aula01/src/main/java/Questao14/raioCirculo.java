package Questao14;

import java.util.Scanner;

/*
Escreva um programa para ler o raio de um círculo, calcular e escrever o valor da área:
Cálculo:  área = PI * (raio²)
 */
public class raioCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double raio, area;

        System.out.println("Escreva o valor do raio:");
        raio = scanner.nextDouble();

        area = Math.PI * (Math.pow(raio, 2));

        System.out.println("O valor da area eh:" + area);
    }
}
