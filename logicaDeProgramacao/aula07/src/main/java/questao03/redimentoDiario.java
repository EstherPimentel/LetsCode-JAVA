package questao03;
/*
3.	João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o
rendimento diário de seu trabalho.
Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca
do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente.
João precisa que você faça um programa que leia a variável peso (peso de peixes) e
calcule o excesso.
Gravar na variável excesso a quantidade de quilos além do limite e na variável multa
o valor da multa que João deverá pagar.
Imprima os dados do programa com as mensagens adequadas.
 */

import java.util.Scanner;

public class redimentoDiario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o peso de peixes: ");
        double pesoP = scanner.nextDouble();

        double excesso = pesoP - 50;
        double multa = excesso * 4;

        if(pesoP <= 50){
            System.out.println("Você não tem multa");
        } else{
            System.out.println("Você excedeu " + excesso + "kg além do permitido e sua multa é de " + multa + " reais pelo excesso");
        }



    }
}
