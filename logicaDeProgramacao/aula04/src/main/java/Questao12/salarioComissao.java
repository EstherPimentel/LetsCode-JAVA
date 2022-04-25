package Questao12;
/*
 Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa.
 Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$1.500,00
 mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu salário total.

 */

import java.util.Scanner;

public class salarioComissao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor do seu salário: ");
        double salario = scanner.nextDouble();

        System.out.println("Insira o valor das vendas: ");
        double vendas = scanner.nextDouble();

        double comissao = 0;
        double extra = (vendas - 1500.00) * 5;

        if(vendas < 50000.00){
            comissao = vendas * 3 / 100;
        } else {
            comissao = 1500.00 + (extra / 100);
        }

        double salarioTotal = salario + comissao;
        System.out.println("Salário Total é: " + salarioTotal);
    }
}
