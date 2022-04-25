package Questao7;

import java.util.Scanner;

/*
Escreva um código que leia um vetor G de 10 elementos do tipo caracter que representa o
gabarito de uma prova. A seguir, para cada um dos 10 alunos da turma, leia o vetor de
respostas (R) do aluno e conte o número de acertos. Mostre o número de acertos do aluno
e uma mensagem APROVADO, se a nota for maior ou igual a 6; e mostre uma mensagem de
REPROVADO, caso contrário.

 */
public class gabaritoProva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] gabarito = new char[9];
        char[] resposta = new char[9];
        int pontos = 0;

        System.out.println("O gabarito da prova é: ");
        for(int x=0; x<gabarito.length; x++){
            gabarito[x] = scanner.next().charAt(0);
        }

            //para cada 1 aluno pega 10 respostas

        for(int i=0; i<10; i++) {
            System.out.println("Insira as respostas do aluno " + i);
            for (int j = 0; j < resposta.length; j++) {
                resposta[j] = scanner.next().charAt(0);

                if (gabarito[j] == resposta[j]) {
                    pontos++;
                }
            }

            if (pontos >= 6) {
                System.out.println("Seus pontos foram: " + pontos + " Você foi APROVADO!");
            } else {
                System.out.println("Seus pontos foram: " + pontos + " Você foi REPROVADO!");
            }
        }

    }
}
