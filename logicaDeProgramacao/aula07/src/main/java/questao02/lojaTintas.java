package questao02;

import java.util.Scanner;

/*
Faça um programa para uma loja de tintas.
O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a
tinta é vendida em latas de 18 litros, que custam R$ 80,00.
Informe ao usuário a quantidade de latas de tinta a serem compradas e o preço total.

 */
public class lojaTintas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe em metros quadrados o tamanho da área a ser pintada: ");
        int area = scanner.nextInt();

        int quantL = area / 54;
        double precoT = 80.00 * quantL;
        System.out.println("A quantidade de latas de tinta a ser comprada é: " + quantL + " \n O preço total é: " + precoT);
    }
}
