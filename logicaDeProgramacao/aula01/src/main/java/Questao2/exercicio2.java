package Questao2;

/*Escreva um programa para determinar a quantidade de cavalos para se levantar uma massa de “m” quilogramas a uma altura de “h” em “t” segundos.
        Considere cavalos = (m * h / t ) / 745,6999 */


import Questao1.Termometro;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        Scanner massa = new Scanner(System.in);
        Scanner altura = new Scanner(System.in);
        Scanner tempo = new Scanner(System.in);
        System.out.println("Insira a massa em quilogramas");
        double massa1= massa.nextDouble();
        System.out.println("Insira a altura em metros");
        double altura1= altura.nextDouble();
        System.out.println("Insira o tempo em segundos");
        double tempo1= tempo.nextDouble();
        Cavalo cavalo= new Cavalo();
        System.out.println(cavalo.cavalos(massa1, altura1, tempo1));


    }
}
