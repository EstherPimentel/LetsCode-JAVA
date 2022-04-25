package Questao15;

import java.util.Scanner;

/*
 Uma loja está levantando o valor total de todas as mercadorias em estoque.
 Escreva um algoritmo que permita a entrada das seguintes informações:

a quantidade de produtos que irá cadastrar
para cada produto:
o nome do produto
o número total de mercadorias no estoque;
o valor unitário da mercadoria.
Imprimir o valor total em estoque e a média de valor das mercadorias.

 */
public class estoqueLoja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a quantidade de produtos que irá cadastrar: ");
        int quant = scanner.nextInt();
        int estoque = 0;
        double total = 0;

        for(int i = 0; i < quant; i++){
            System.out.println("Informe o nome do produto: ");
            String prod = scanner.next();
            System.out.println("Informe a quantidade total da mercadoria em estoque: ");
            int est= scanner.nextInt();
            System.out.println("Informe o valor unitário do produto: ");
            double valorUnit = scanner.nextDouble();
            estoque+= est;
            total+= (est * valorUnit);
        }
            total/= estoque;

        System.out.println("O total de produtos em estoque é: "+ estoque + "\n O valor médio dos produtos é: " + total);



    }
}
