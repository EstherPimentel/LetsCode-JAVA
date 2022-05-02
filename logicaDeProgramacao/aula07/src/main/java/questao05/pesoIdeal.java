package questao05;

import java.util.Scanner;

/*
5.	Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
a.	Para homens: (72.7*h) - 58
b.	Para mulheres: (62.1*h) - 44.7


 */
public class pesoIdeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe sua altura: ");
        double altura = scanner.nextDouble();

        double homens = (72.7 * altura) - 58;
        double mulheres = (62.1 * altura) - 44.7;

        System.out.println("O peso ideal para mulher é: " + mulheres + " \n O peso ideal para homem é: " + homens);
    }
}
