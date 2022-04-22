package Questao6;

import java.util.Scanner;

/*
Crie um algoritmo que realize a conversão do valor em real para as seguintes moedas:
Dólar
Euro
Libra

 */
public class conversaoMoeda {
    public static void main(String[] args) {
        double real;
        double dolar = 4.62;
        double euro =5.26;
        double libra =6.43;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor a ser convertido: ");
        real = scanner.nextDouble();
        System.out.println("O valor em dólar é: " + (real / dolar));
        System.out.println("O valor em euro é: " + (real / euro));
        System.out.println("O valor em libra é: " + (real / libra));


    }
}
