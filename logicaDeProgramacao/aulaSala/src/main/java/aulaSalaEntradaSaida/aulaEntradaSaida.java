package aulaSalaEntradaSaida;

import java.util.Scanner;

public class aulaEntradaSaida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Imprimindo com printLN");
        System.out.print("Imprimindo na mesma linha\n");

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.printf("A %s tem %d anos.", nome, idade);
        System.out.println("\nA " + nome + " tem " + idade + " anos.");
    }
}
