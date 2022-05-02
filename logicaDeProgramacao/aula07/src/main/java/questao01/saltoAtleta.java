package questao01;

import java.util.Scanner;

/*
Em uma competição de salto em distância cada atleta tem direito a cinco saltos.
No final da série de saltos de cada atleta, o melhor e o pior resultados são eliminados.
O seu resultado fica sendo a média dos três valores restantes.
Você deve fazer um programa que receba o nome e as cinco distâncias alcançadas pelo atleta
em seus saltos e depois informe a média dos saltos conforme a descrição acima informada
(retirar o melhor e o pior salto e depois calcular a média).
Faça uso de uma lista para armazenar os saltos. Os saltos são informados na ordem da execução,
portanto não são ordenados.

O programa deve ser encerrado quando não for informado o nome do atleta.
A saída do programa deve ser conforme o exemplo abaixo:

Atleta: João da Silva

Primeiro Salto: 6.5 m
Segundo Salto: 6.1 m
Terceiro Salto: 6.2 m
Quarto Salto: 5.4 m
Quinto Salto: 5.3 m

Melhor salto: 6.5 m
Pior salto: 5.3 m

Média dos demais saltos: 5.9 m


Resultado final:
Rodrigo Curvêllo: 5.9 m

 */
public class saltoAtleta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String atleta = "João da Silva";
        String[]ordem = {"primeiro", "segundo", "terceiro", "quarto", "quinto"};
        double saltoMenor = 100;
        double saltoMaior = 0;
        double[] salto = new double [5];
        double soma = 0;
        System.out.println("Informe as alturas dos saltos: ");

        for(int i = 0; i < salto.length; i++){
            salto[i] = scanner.nextDouble();
            soma+= salto[i];

            if(salto[i] > saltoMaior) {
                saltoMaior = salto[i];
            }
            if(salto[i] < saltoMenor){
                saltoMenor = salto[i];
            }

        }
        soma = (soma - saltoMenor - saltoMaior) / 3;
        System.out.println("O nome do atleta é: " + atleta);

        for(int i = 0; i < 5; i++){
            System.out.println("O saltos foram: " + ordem[i] + salto[i] + "\n");
        }
        System.out.println("O melhor salto foi: " + saltoMaior + "\n O menor salto foi: " + saltoMenor);
        System.out.println("A média da altura de saltos foi: " + soma + "\n O resultado final foi: " + atleta + soma);

    }
}


