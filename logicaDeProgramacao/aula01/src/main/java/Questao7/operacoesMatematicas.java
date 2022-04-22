package Questao7;
/*
Crie um programa que receba 2 números e ao final mostre as seguintes operações:
Soma
Subtração
Multiplicação
Divisão
 */

import java.util.Scanner;

public class operacoesMatematicas {
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextInt();

        int soma = num1 + num2 ;
        int sub = num1 - num2;
        int multi = num1 * num2;
        int div = num1 / num2;

        System.out.println("A soma dos dois números é: " + soma);
        System.out.println("A subtração dos dois números é: " + sub);
        System.out.println("A multiplicação dos dois números é: " + multi);
        System.out.println("A divisão dos dois números é: " + div);



    }
}
