package Questao2;

import java.util.Scanner;

/*
 Escreva um código Java que leia 10 valores double do teclado e armazene-os em
 uma matriz de dimensões 2x5.

 */
public class matriz10valores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] matriz = new double[2][5];

        for (int i=0; i<matriz.length; i++){
            for(int j= 0; j<matriz[i].length; j++){
                System.out.printf("Digite um valor: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Matriz: ");
        for(double[] linha : matriz){ //pega a primeira linha e navega por cada elemento
            for (double cadaElementoDaColuna : linha){ //paga cada elemento da coluna
                System.out.print(cadaElementoDaColuna + " ");
            }

            System.out.println(); //pula linha depois de percorrer cada linha
        }
    }
}
