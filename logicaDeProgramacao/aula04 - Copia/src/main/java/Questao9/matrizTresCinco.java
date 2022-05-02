package Questao9;
/*
Crie um programa que preencha uma matriz de 3x5 com números inteiros. Em seguida faça:
some cada uma das linhas armazenando o resultado em um vetor;
some cada uma das colunas armazenando o resultado em um vetor;
imprima o resultado da soma das linhas;
imprima o resultado da soma das coluna;
imprima a matriz completa

 */

import java.util.Random;

public class matrizTresCinco {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz = new int[3][5];
        int[] matrizLinha = new int [3]; // [valorLinha1, valorLinha2, valorLinha3]
        int[] matrizColuna = new int[5]; // [valorColuna1, valorColuna2, valorColuna3, valorColuna4, valorColuna5]

        int somaL = 0; // valor soma das linhas
        int somaC = 0; // valor soma das colunas

        //CRIANDO MATRIZ [3][5]
        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(30);
            }
        }

        //CRIANDO O ARRAY DE LINHAS: [valorLinha1, valorLinha2, valorLinha3]

        int sumL = 0;
        for (int l = 0; l < matrizLinha.length; l++) {
            for (int c = 0; c < matrizColuna.length; c++) {
                somaL += matriz[l][c]; // somando as linhas
            }
            matrizLinha[l] = somaL; // colocando no array

            sumL += matrizLinha[l]; // somando os valores do array
        }

        for(int x : matrizLinha){
            System.out.print(x + " ");
        }
        System.out.println("\nO valor das linhas é: " + sumL + "\n"); //VALOR SOMA DAS LINHAS


        //CRIANDO O ARRAY DE COLUNAS: [valorColuna1, valorColuna2, valorColuna3, valorColuna4, valorColuna5]
        int sumC = 0;
        for (int c = 0; c < matrizColuna.length; c++) {
            for (int l = 0; l < matrizLinha.length; l++) {
                somaC += matriz[l][c]; //somando as linhas
            }
            matrizColuna[c] = somaC; // colocando no array

            sumC += matrizColuna[c]; // somando os valores do array
        }
        for(int y : matrizColuna){
            System.out.print(y + " ");
        }
        System.out.println("\nO valor das colunas é: " + sumC + "\n"); // VALOR SOMA DAS COLUNAS


        //IMPRIMINDO A MATRIZ [3][5]
        System.out.println("\nA matriz é: ");
        for(int[] linha : matriz){  //pega a primeira linha e navega por cada elemento
            for (int cadaElementoDaColuna : linha){  //pega cada elemento da coluna
                System.out.print(cadaElementoDaColuna + " ");
            }

            System.out.println(); //pula linha depois de percorrer cada linha
        }

    }
}
