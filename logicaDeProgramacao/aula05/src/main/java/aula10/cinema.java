package aula10;

import java.util.Scanner;

/*
Cada espectador de um cinema respondeu a um questionário no qual constava sua
idade e a sua opinião em relação ao filme:

3 - ótimo,
2 - bom,
1 - regular

 Faça um programa que receba a idade e a opinião de 5 espectadores e que calcule e mostre:


A média das idades das pessoas que responderam ótimo;
A quantidade de pessoas que respondeu regular;
A percentagem de pessoas que respondeu “bom” entre todos os espectadores analisados.

 */
public class cinema {
    public static void main(String[] args) {

        int somaI = 0;
        int countR = 0;
        int countO = 0;
        double perc = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu de opções: \n Digite 1 para REGULAR \n Digite 2 para BOM \n Digite 3 para ÓTIMO");
        int[]pessoas = new int[5];

        for(int i = 0; i < pessoas.length; i++){
            System.out.println("Informe sua idade: ");
            int idade = scanner.nextInt();

            System.out.println(("Informe sua opinião: "));
            int opiniao = scanner.nextInt();

            if(opiniao == 3){
                countO++;
                somaI+= idade;
            }
            if(opiniao == 1){
                countR++;
            }
            if(opiniao == 2){
                perc++;
            }

            if(opiniao < 1 || opiniao > 3){
                System.out.println("Digite um valor válido");
            }
        }
        System.out.println("A média das idades das pessoas que responderam ótimo é: " + somaI /countO);
        System.out.println("A quantidade de pessoas que respondeu regular foi: " + countR);
        System.out.println("A percentagem de pessoas que respondeu “bom” entre todos os espectadores analisados foi: " + perc * 100 / 5);
    }
}
