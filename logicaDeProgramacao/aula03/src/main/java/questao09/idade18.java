package questao09;

import java.util.Scanner;

/*
Escreva um programa que exiba quantas pessoas possuem mais de 18 anos. O algoritmo deverá ler a idade de 10 pessoas.

 */
public class idade18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma= 0;

        for(int i = 0; i<10; i++){
            System.out.println("Insira uma idade");
            int idades = scanner.nextInt();
            if(idades > 18){
                soma++;
            }
        }
        System.out.println(soma + "tem mais de 18 anos");
    }
}
