package Questao1;

/*Escreva um programa que leia quatro notas escolares de um aluno e apresenta uma mensagem informando se o aluno foi aprovado caso apresente
o valor da média escolar maior ou igual a 7. Caso contrário, apresente uma mensagem informando que ele está de recuperação.
*/

import java.util.Scanner;

public class mediaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1= scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2= scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3= scanner.nextDouble();
        System.out.println("Digite a quarta nota: ");
        double nota4= scanner.nextDouble();
        double media= (nota1 + nota2 + nota3 + nota4)/4;

        if(media >= 7 && media <= 10){
            System.out.println("O aluno foi aprovado!");
        } else if (media >=0 && media < 7){
            System.out.println("O aluno for reprovado!");
        } else{
            System.out.println("Nota não existe");
        }

    }
}

/*CÓDIGO RAONI

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ordem = {"primeira", "segunda", "terceira", "quarta"};
        double media = 0, notas = 0;
        for (int i = 0; i < 4; i++){
            System.out.print("Informe a " + ordem[i] + " nota: ");
            notas += scanner.nextDouble();
        }
        media = notas / 4;

        if (media >= 7){
            System.out.println("O aluno foi aprovado!");
        } else {
            System.out.println("O aluno foi reprovado");
        }
    }

}*/