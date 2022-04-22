package Questao1;

/*Escreva um programa que seja capaz de receber as seguintes informações e calcular a média da nota de um aluno:
Nome
Turma
Nota 1
Nota 2
Nota 3
*/

import java.util.Scanner;

public class notaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite sua turma: ");
        String turma = scanner.nextLine();
        double[] notas = new double[3];
        double media = 0;
        for(int i = 0; i < notas.length; i++){
            System.out.print("Insira a nota:");
            notas[i] = scanner.nextDouble();

            media = media + notas[i];
        }

        System.out.println("A média é: " + (media / 3));
    }
}
