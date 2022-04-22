package questao02;
/*Faça um programa que leia um número inteiro diferente de zero e mostre
uma mensagem indicando se este número é positivo ou negativo.
Pare a execução do programa quando o usuário requisitar
(O programa deve parar quando o usuário escolher 0).
*/

import java.util.Scanner;

public class numeroInteiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 1;


        while(numero !=0){

            System.out.println("Digite um número: ");
            numero= scanner.nextInt();
            if(numero == 0){
                break;
            }
            if (numero < 0) {
                System.out.println("O número é negativo");
            } else if (numero > 0) {
                System.out.println("O número é positivo");
            }

        /*do {
            System.out.println("Deseja saber se um número é positivo ou negativo? Digite  sim para continuar ou 0 para sair ");
            resposta = scanner.next();

            try {
// se o usuário digitar 'sim' inicia o programa
                if(resposta.equals("sim")){
                    System.out.println("Digite o número");
                    Scanner scanner = new Scanner(System.in);
                }

            } */
        }
    }
}
