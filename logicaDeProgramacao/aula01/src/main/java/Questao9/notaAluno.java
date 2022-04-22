package Questao9;

import java.util.Scanner;

/*
Escreva um programa que leia o nome de um aluno e as notas das 3 primeiras provas que ele obteve no semestre. No final deverá informar a média do aluno.

 */
public class notaAluno {
    public static void main(String[] args) {
        double media;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String aluno  = scanner.nextLine();
        System.out.println("Insira sua primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Insira sua segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Insira sua terceira nota: ");
        double nota3 = scanner.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("As notas do aluno " + aluno + " foram: ");
        System.out.println(nota1 + ", " + nota2 +" e "+ nota3);
        System.out.println("Sua média é: " + media);
    }
}
