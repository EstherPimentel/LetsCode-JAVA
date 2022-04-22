package questao07;

import java.util.Scanner;

/*
Escreva um programa que recebe um número inteiro maior que zero e calcula o seu valor fatorial.
 */
public class valorFatorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero, fatorial = 1;

            System.out.println("Digite um número");
            numero = scanner.nextInt();

            for(int i = 1;i <= numero; i++){
                fatorial = fatorial * i;
            }

            System.out.println("!" + numero + " = " + fatorial);
    }
}

/* Passo-a-passo do algoritmo
fat = fat * i -> fat
fat = 1 * 1 -> 1
fat = 1 * 2 -> 2
fat = 2 * 3 -> 6
fat = 6 * 4 -> 24
fat = 24 * 5 -> 120
 */



