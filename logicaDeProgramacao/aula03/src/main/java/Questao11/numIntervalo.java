package Questao11;

import java.util.Random;

/*
Escreva um programa que receba dois números inteiros e imprima os números inteiros que estão no intervalo compreendido entre eles.
 */
public class numIntervalo {
    public static void main(String[] args) {
        Random random = new Random();
        int n1 = random.nextInt(20);
        int n2 = random.nextInt(20);

        for(int i = Math.min(n1, n2); i < Math.max(n1, n2); i++){
            System.out.println(i);
        }
        System.out.println(n1 + " e " + n2);

    }
}
