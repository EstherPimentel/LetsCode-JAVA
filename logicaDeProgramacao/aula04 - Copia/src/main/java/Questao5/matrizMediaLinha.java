package Questao5;

import java.util.Scanner;

/*Crie um método que recebe uma matriz bidimensional inteira e um
inteiro que indica uma de suas linhas, e retorna a média dos valores
daquela linha
*/

public class matrizMediaLinha {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int [3][4];
        int indicador;
        int media = 0;

        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite 12 números: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("A matriz é: ");
        for(int[] linha : matriz){  //pega a primeira linha e navega por cada elemento
            for (int cadaElementoDaColuna : linha){  //pega cada elemento da coluna
                System.out.print(cadaElementoDaColuna + " ");
            }

            System.out.println(); //pula linha depois de percorrer cada linha
        }

        System.out.println("Escolha uma linha da matriz entre 0 e 2:");
        indicador = scanner.nextInt();
        while (indicador < 0 || indicador > 2) {
            System.out.println("Esse número não é válido! Escolha entre 0 e 2:");
            indicador = scanner.nextInt();
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                media = (matriz[indicador][0] + matriz[indicador][1] + matriz[indicador][2] + matriz[indicador][3]) / 4;
            }
        }
        System.out.println("A média da linha " + indicador + " é: " + media);
    }
}


