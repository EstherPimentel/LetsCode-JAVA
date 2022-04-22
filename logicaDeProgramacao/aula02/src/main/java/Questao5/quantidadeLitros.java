package Questao5;

import java.util.Scanner;

/*
5. Escreva um programa para calcular a quantidade de litros de combustível necessária para se fazer
uma viagem, sabendo-se que o carro faz 12 Km com um litro. Deverão ser fornecidos o tempo gasto
na viagem e a velocidade média.

utilizar as seguintes fórmulas:
 	distância = tempo x velocidade
    litros usados = distância / 12

 */
public class quantidadeLitros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tempo gasto na viagem: ");
        double tempoV = scanner.nextDouble();
        System.out.println("Digite a velocidade média do carro: ");
        double velocidade = scanner.nextDouble();

        double distancia = tempoV * velocidade;
        double litros = distancia / 12;

        System.out.println(" A quantidade de litros necessária para a viagem é: " + litros);
    }
}
