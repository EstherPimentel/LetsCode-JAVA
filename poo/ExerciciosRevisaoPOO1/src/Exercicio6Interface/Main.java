package Exercicio6Interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();

       System.out.println("Soma : " + soma.calcular(7, 3));
       System.out.println("Subtração : " + subtracao.calcular(1, 3));
       System.out.println("Multiplicação : " + multiplicacao.calcular(2, 3));
       System.out.println("Divisão : " + divisao.calcular(4, 3));

        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Escolha uma das opções\n");

            System.out.println("--------------CALCULADORA--------------");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            System.out.println("----------------------------------------");
            int option = scanner.nextInt();

        while (option > 0 && option < 5) {
            switch(option){
                case 0:
                    System.out.println("\nAté logo !!!");
                   break;
                case 1:
                    soma.calcular();
                    break;
                case 2:
                    subtracao.calcular();
                    break;
                case 3:
                    multiplicacao.calcular();
                    break;
                case 4:
                    divisao.calcular();
                    break;

                default: System.out.println("\nOpção Inválida, por favor tente novamente.");
            }
        }

         */
    }
}