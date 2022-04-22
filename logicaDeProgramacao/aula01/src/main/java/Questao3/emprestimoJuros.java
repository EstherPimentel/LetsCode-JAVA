package Questao3;

/*
Escreva um programa que realize o cálculo do empréstimo a juros compostos.
Onde definimos:
 o valor da variável de quanto a pessoa quer emprestado;
em quantos meses ela irá pagar
A taxa de juros será de 2% ao mês
Fórmula: M = C * (1+i)^t
M = valor final após a aplicação dos juros
C = valor que a pessoa vai pegar emprestado
i é a taxa de juros
t é o tempo
Deverá exibir quanto a pessoa irá pagar após a aplicação dos juros

 */

import java.util.Scanner;

public class emprestimoJuros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do empréstimo: ");
        double c = scanner.nextDouble();
        System.out.println("Digite em quantos meses pretende pagar: ");
        int t = scanner.nextInt();
        double i = 0.02;
        double m = c*Math.pow(1+i, t);
        System.out.println("O valor final a ser pago é: " + m);

    }
}
