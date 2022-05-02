package aula02;

import java.util.Scanner;

/*
Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do imposto de Renda, que depende
do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do salário bruto, mas
 não é descontado (é a empresa que deposita.)

 O salário líquido corresponde ao salário bruto menos os descontos O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.

a. Desconto do IR;
b. Salário Bruto até R$900,00 (inclusive) – Isento;
c. Salário Bruto de R$ 1500, 00 (inclusive) – desconto de 5%;
d. Salário bruto até R$ 2500,00 (Inclusive) – desconto de 10%;
e. Salário bruto acima de 2500 – Desconto de 20%.


 */
public class folhaPagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor recebido por hora: ");
        double horaSalario = scanner.nextDouble();

        System.out.println("Insira a  quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        double salarioBruto = horaSalario * horasTrabalhadas;
        double sindicato = salarioBruto * 3 / 100;
        double fgts = salarioBruto * 11 / 100;
        double desconto = 0;
        if(salarioBruto <= 900.00){
            desconto = 0;
        } else if(salarioBruto > 900.00 && salarioBruto <= 1500.00){
            desconto = salarioBruto * 5 /100;
        } else if( salarioBruto > 1500.00 && salarioBruto <= 2500.00){
            desconto = salarioBruto * 10 / 100;
        } else {
            desconto = salarioBruto * 20 /100;
        }
        double salarioLiquido = salarioBruto - sindicato - desconto;
        System.out.println("O salário bruto é: "+ salarioBruto + " \nO salário líquido a ser recebido é: " + salarioLiquido + " \nO valor do FGTS é: " + fgts);
    }
}
