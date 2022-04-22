package Questao1;
/*Escreva um programa que com base em uma temperatura em graus celsius, realize a conversão e exiba os resultados conforme as fórmulas abaixo:
Kelvin
K = Celsius + 273.15;
Fahrenheit
F = Celsius * 1.8 + 32;
Rankine
Ra = Celsius * 1.8 + 32 + 459.67
Réaumur
Re = Celsius * 0.8;
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner conversao = new Scanner(System.in);
        double celsius= conversao.nextDouble();
        Termometro termometro= new Termometro();
        System.out.println(termometro.kelvin(celsius));
        System.out.println(termometro.fahrenheit(celsius));
        System.out.println(termometro.rankine(celsius));
        System.out.println(termometro.reaumur(celsius));
    }
}
