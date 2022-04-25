package Questao10;

import java.util.Scanner;

/*

Faça a leitura de um valor inteiro. Em seguida, calcule o menor número de notas possíveis
(cédulas) onde o valor pode ser decomposto. As notas que você deve considerar são de
100, 50, 20, 10, 5, 2 e 1.
Na sequência mostra o valor lido e a relação de notas necessárias.

 */
public class cedulas {
    public static void main(String[] args) {
        int cedulas, c100=0, c50=0, c20=0, c10=0, c5=0, c2=0, c1=1;

    Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um valor: ");
        int valor = scanner.nextInt();

        //PRECISA COMEÇAR DO MAIOR VALOR DE CÉDULA PARA O MENOR

        cedulas = valor; // é necessário para printar o valor depois
        c100 = valor / 100; // se valor = 300 então 300/100 = 3 -> LOGO c100 = 3
        valor %= 100; // 300/100 = resto 0 -> ENTÃO valor = 0
        c50 = valor / 50; //
        valor %= 50;
        c20 = valor / 20;
        valor %= 20;
        c10 = valor / 10;
        valor %= 10;
        c5 = valor / 5;
        valor %= 5;
        c2 = valor / 2;
        valor %= 2;
        c1 = valor;

        System.out.println(cedulas); //300
        System.out.println(c100 + " cédulas de R$ 100,00"); //c100 = 3
        System.out.println(c50 + " cédulas de R$ 50,00"); // = 0
        System.out.println(c20 + " cédulas de R$ 20,00"); // = 0
        System.out.println(c10 + " cédulas de R$ 10,00"); // = 0
        System.out.println(c5 + " cédulas de R$ 5,00"); // = 0
        System.out.println(c2 + " cédulas de R$ 2,00"); // = 0
        System.out.println(c1 + " cédulas de R$ 1,00"); // = 0


    }
}

/*
Insira um valor:
1563
1563
15 cédulas de R$ 100,00
1 cédulas de R$ 50,00
0 cédulas de R$ 20,00
1 cédulas de R$ 10,00
0 cédulas de R$ 5,00
1 cédulas de R$ 2,00
1 cédulas de R$ 1,00
 */