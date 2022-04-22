package Questao2;
/*2. Elabore um programa que escreve seu nome completo na primeira linha, seu endereço na segunda, e o CEP e telefone na terceira.
*/

import java.util.Scanner;

public class formulario {
    public static void main(String[] args) {
        Scanner formulario = new Scanner(System.in);
        String nome = "Esther";
        String endereco = "Rua Qualquer lugar";
        String cep = "21258053";
        String telefone = "(21)999999999";

        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("CEP: " + cep + " Telefone: " + telefone);
    }

}
