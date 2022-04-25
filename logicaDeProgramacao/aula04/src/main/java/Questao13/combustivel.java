package Questao13;

import java.util.Scanner;

/*
Um posto está vendendo combustíveis com a seguinte tabela de descontos:


Álcool
até 20 litros, desconto de 3% por litro
acima de 20 litros, desconto de 5% por litro

Gasolina
até 20 litros, desconto de 4% por litro
acima de 20 litros, desconto de 6% por litro


Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível
(codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago
pelo cliente sabendo-se que o preço do litro da gasolina é R$ 7,59 e o preço do
litro do álcool é R$ 5,20.

 */
public class combustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tipo de combustível: A = álcool ou G = gasolina");
        String tipo = scanner.nextLine();
        System.out.println("Informe a quantidade de combustível");
        double litros = scanner.nextDouble();
        double preco = 0;

        if (tipo.equalsIgnoreCase("a")){
            preco = litros * 5.20;
            if(litros <= 20){
                preco -= (5.20 * litros * 3) / 100;
            } else {
                preco -= (5.20 * litros * 5) / 100;
            }
        } else if(tipo.equalsIgnoreCase("g")){
            preco = litros * 7.59;
            if(litros <= 20){
                preco -= (7.59 * litros * 4) / 100;
            } else{
                preco -= (7.59 * litros * 6) / 100;
            }

        } else {
            System.out.println("Insira A ou G");
        }

        System.out.println("O valor a pagar é: " + preco);
    }

}
