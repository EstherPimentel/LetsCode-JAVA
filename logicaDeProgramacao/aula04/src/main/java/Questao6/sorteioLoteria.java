package Questao6;

import java.util.Scanner;

/*
Escreva um programa que leia um vetor de 13 elementos inteiros, que é o Gabarito de um
teste da loteria esportiva, contendo os valores 1(coluna 1), 2 (coluna 2) e 3 (coluna 3).
Leia, a seguir, para cada apostador, o número do seu cartão e um vetor de Respostas de
13 posições. Verifique para cada apostador o números de acertos, comparando o vetor de
Gabarito com o vetor de Respostas. Escreva o número do apostador e o número de acertos.
Se o apostador tiver 13 acertos, mostrar a mensagem "Ganhador".

 */
public class sorteioLoteria {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] gabarito = new int[12];
        int[] resposta = new int[12];
        int pontos = 0;

        System.out.println("Os números sorteados são: ");
        for(int i=0; i<gabarito.length; i++){
            gabarito[i] = scanner.nextInt();
        }

        System.out.println("Insira o número do seu cartão: ");
        int numCartao = scanner.nextInt();

        System.out.println("Insira os números do seu cartão: ");
        for(int j=0; j<resposta.length; j++){
            resposta[j] = scanner.nextInt();


            if(gabarito[j] == resposta[j]){
                pontos++;
            }
        }

        for(int resultado : resposta){
            System.out.print("Seu cartão é: " + numCartao);
        }

        if(pontos == 13){
            System.out.println("Você ganhou!!");
        } else {
            System.out.println("Seus pontos foram: " + pontos);
        }

    }
}
