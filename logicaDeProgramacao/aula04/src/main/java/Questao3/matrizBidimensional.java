package Questao2;/*

 Crie um método que recebe uma matriz bidimensional double e retorna o maior valor da matriz.

 */

import java.util.Random;

public class matrizBidimensional {
    public static void main(String[] args) {
        Random random = new Random();
        double [][]matriz = new double[6][3];

        double biggerValue = 0;

        for(int x =0; x<matriz.length; x++){
            for(int y=0; y<matriz[x].length; y++){
                matriz[x][y] = random.nextDouble(30);

                if(matriz[x][y] > biggerValue) {
                    biggerValue = matriz[x][y];
                }
                System.out.println(matriz[x][y]);
            }
        }

        System.out.println("O maior número é: " + biggerValue);
    }
}
