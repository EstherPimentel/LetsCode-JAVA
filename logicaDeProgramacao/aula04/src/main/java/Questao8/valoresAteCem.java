package Questao8;
/*
Faça um programa para receber um conjunto de 10 valores até 100, e insira em uma matriz, em seguida você deverá receber
um outro valor e verificar se o elemento existe no conjunto de 10 valores da matriz. Caso exista você deve imprimir uma
mensagem: "O valor existe no conjunto", caso contrário deverá exibir: "--
 */

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class valoresAteCem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int [] valores = new int[10];
        int num;

        System.out.println("Insira um número menor ou igual a 100:");
        num = scanner.nextInt();

        for(int i = 0; i < valores.length; i++){
            valores[i] = random.nextInt(100);
            if(num == valores[i]){
                System.out.println("O valor inserido existe no array: " + num);
                System.exit(0);
            }
        }
        System.out.println("O valor não existe no array");
    }
}
