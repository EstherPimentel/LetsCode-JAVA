package questao12;

import java.util.Scanner;

/*
Escreva um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres;
Idade: entre 0 e 150
Salário: maior que 0
Sexo: ‘f’ ou ‘m’
Estado civil: ‘s’, ‘c’, ‘v’, ‘d’
 */
public class validaInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        while(true) {
            System.out.println("Informe seu nome: ");
            nome = scanner.nextLine();
            if (nome.length() < 3) {
                System.out.println("O nome precisa ter 3 ou mais caracteres");
            }
        }

        while(true) {
            System.out.println("Informe sua idade: ");
            int idade = scanner.nextInt();
            if (idade <= 0 || idade >= 150) {
                System.out.println("Idade precisa ser maior que 0 e menor que 150");
            }
        }

        while(true) {
            System.out.println("Iforme seu salário: ");
            double salario = scanner.nextDouble();
            if (salario <= 0) {
                System.out.println("Informe valor maior que 0");
            }
        }

            String sexo;
            while (true) {
                System.out.println("Informe seu sexo como (f / m): ");
                sexo = scanner.nextLine();

                if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
                    break;
                } else {
                    System.out.println("Informe M ou F");
                }
            }

            String estadoCivil;
            while (true) {
                System.out.println("Informe seu estado civil (c / s / v / d): ");
                estadoCivil = scanner.nextLine();

                if (estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
                    break;
                } else {
                    System.out.println("Informe c, s, v ou d");
                }
            }

        System.out.println("Seu nome é: " + nome + "\nSua idade é: " + idade + "\nSeu salário é: " + salario + "\n Seu sexo é: " + sexo + "\nSeu estado civil é: " + estadoCivil);
    }
}
