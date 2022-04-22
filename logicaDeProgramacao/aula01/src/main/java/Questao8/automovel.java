package Questao8;

import java.util.Scanner;

/*
Escreva um programa em java para definir o consumo médio de um automóvel sendo fornecido a distância total percorrida pelo automóvel e o total de combustível gasto (litros).
 */
public class automovel {
    public static void main(String[] args) {
        double km, l, consumo;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a distância percorrida em quilômetros: ");
        km = scanner.nextDouble();
        System.out.println("Insira a quantidade de combustível gasto:  ");
        l = scanner.nextDouble();

        consumo = km/l;

        System.out.println("O consumo médio de combustível é: " + consumo + "km/l");
    }
}
