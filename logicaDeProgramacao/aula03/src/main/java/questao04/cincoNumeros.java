package questao04;

/* Escreva um programa que receba 5 números inteiros, armazene-os em um array,
e imprima na tela os valores em ordem decrescente.
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class cincoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[5];
        for(int i = 0; i<numeros.length; i++){
            System.out.println("Insira um número");
            numeros[i] = scanner.nextDouble();
        }
        Arrays.sort(numeros);

        for (int i = numeros.length-1; i > 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
