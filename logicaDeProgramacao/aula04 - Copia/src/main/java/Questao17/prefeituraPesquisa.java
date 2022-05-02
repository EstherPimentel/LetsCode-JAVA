package Questao17;

import java.util.Scanner;

/*
A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes.
Faça um algoritmo para coletar dados sobre o salário e número de filhos de cada habitante
e após as leituras, escrever:

Média de salário da população
Média do número de filhos
Maior salário dos habitantes
Percentual de pessoas com salário menor que R$ 150,00

Obs: O final da leitura dos dados se dará com a entrada de um “salário negativo”.

 */
public class prefeituraPesquisa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario = 0;
        double salarioMa = 0;
        double salarioMe = 0;
        int filhos = 0;

        System.out.println("Insira número de habitantes da cidade: ");
        int numHab = scanner.nextInt();

        for(int i = 0; i < numHab; i++){
            System.out.println("Insira o salário: ");
            double sal = scanner.nextDouble();
            System.out.println("Insira número de filhos");
            double fil = scanner.nextInt();
            filhos+= fil;
            salario+= sal;

            if(salarioMa < sal){
                salarioMa = sal;
            }

            if(sal <= 150){
                salarioMe++;
            }
        }
        salario/= numHab;
        filhos/= numHab;
        salarioMe = salarioMe * 100 / numHab;

        System.out.println("A média de salário por habitantes é: " + salario);
        System.out.println("A média de filhos por habitantes é: " + filhos);
        System.out.println("O maior salário da cidade é: " + salarioMa);
        System.out.println("A porcentagem de habitantes com salário menor que 150,00 é: " + salarioMe + "%");
    }
}

