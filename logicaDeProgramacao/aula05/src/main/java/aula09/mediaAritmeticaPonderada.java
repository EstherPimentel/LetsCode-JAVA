package aula09;

import java.util.Scanner;

/*
Faça um programa que apresente o menu de opções a seguir:
Menu de opções:
	1. Média aritmética
	2. Média ponderada
Digite a opção desejada:
	Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
	Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar a média ponderada.
Verifique a possibilidade de opção inválida, mostrando uma mensagem.

 */
public class mediaAritmeticaPonderada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu de opções: \n Digite 1 para Média aritmética \n Digite 2 para Média ponderada");

        int opcao = scanner.nextInt();
        double soma = 0;
        double produto = 0;
        int pesoT = 0;

        if(opcao == 1){
            System.out.println("Digite 2 notas: ");
            for(int i = 0; i < 2; i++){
                double nota = scanner.nextDouble();
                soma += nota;
            }
            System.out.println("A média aritmética é: " + soma / 2);

        } else if (opcao == 2){
            for(int i = 0; i < 3; i++){
                System.out.println("Informe a nota: ");
                double nota = scanner.nextDouble();
                System.out.println("Informe o peso da nota: ");
                int peso = scanner.nextInt();

                produto += (nota * peso);
                pesoT += peso;
            }
            System.out.println("A média ponderada é: " + produto / pesoT);
        } else{
            System.out.println("Digite uma opção válida!");
        }
    }
}
