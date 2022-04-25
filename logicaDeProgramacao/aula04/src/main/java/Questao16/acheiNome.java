package Questao16;

import java.util.Random;
import java.util.Scanner;

/*
Escreva um algoritmo que permita a leitura dos nomes de 10 pessoas e armazenar os nomes lidos
em um vetor. Após isto, o algoritmo deve permitir a leitura de mais 1 nome qualquer de pessoa
e depois escrever a mensagem ACHEI, se o nome estiver entre os 10 nomes lidos anteriormente
(guardados no vetor), ou NÃO ACHEI caso contrário
 */
public class acheiNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[3];
        String nome;

        System.out.println("Insira um nome: ");
        nome = scanner.next();

        System.out.println("Informe dez nomes: ");
        for(int i = 0; i < nomes.length; i++){
            nomes[i] = scanner.next();
        }

        for(int i = 0; i < nomes.length; i++){
            if(nome.equalsIgnoreCase(nomes[i])){
                System.out.println("ACHEI o nome " + nome);
                System.exit(0);
            }
        }
        System.out.println("NÃO ACHEI o nome!");

    }
}
