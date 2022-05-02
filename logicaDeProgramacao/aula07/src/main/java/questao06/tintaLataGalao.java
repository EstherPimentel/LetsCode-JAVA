package questao06;

import java.util.Scanner;

/*
6.	Faça um Programa para uma loja de tintas.
O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que
a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 2 situações:
a.	comprar apenas latas de 18 litros;
b.	comprar apenas galões de 3,6 litros;

 */
public class tintaLataGalao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe em metros quadrados o tamanho da área a ser pintada: ");
        int area = scanner.nextInt();
        double litros = area / 6;
        int latas = area / 108;
        double precoL = 80.00 * latas;
        double galoes = area / 21.6;
        double precoG = 25.00 * galoes;

        System.out.println("A quantidade de tinta necessária é " + litros + " litros");
        System.out.println("A quantidade em latas de tinta é: " + latas + ". O preço total é: " + precoL);
        System.out.println("A quantidade de galões é: " + galoes + ". O preço total é: " + precoG);
    }
}
