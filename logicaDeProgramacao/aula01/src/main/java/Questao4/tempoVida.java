package Questao4;

import java.util.Scanner;

/*
Crie um programa que você atribua um valor da idade de uma pessoa e calcule quantos dias aquela pessoa já viveu
 */
public class tempoVida {
    public static void main(String[] args) {
        int anos, meses, dias;
        int idadeEmDias;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Para saber quantos dias de vida você tem é importante informar quantos anos, meses e dias você tem de vida.");
        System.out.println("Digite sua idade em anos: ");
        anos = scanner.nextInt();
        System.out.println("Digite seus meses de vida: ");
        meses = scanner.nextInt();
        System.out.println("Digite sua idade em dias: ");
        dias = scanner.nextInt();

        idadeEmDias = anos * 365 + meses * 30 + dias;

        System.out.println("Seu tempo de vida em dias é: " + idadeEmDias);
    }
}
