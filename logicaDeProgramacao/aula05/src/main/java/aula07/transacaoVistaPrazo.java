package aula07;

import java.util.Scanner;

/*
Uma loja utiliza o código V para transação à vista e P para transação a prazo.
Faça um programa que receba código e valor de 15 transações usando laços de repetição.

Calcule e mostre:
O valor total das compras à vista
O valor total das compras a prazo.
O valor total das compras efetuadas
O valor da primeira prestação das compras a prazo, sabendo-se que essas serão pagas em três vezes

 */
public class transacaoVistaPrazo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] transacao = new String[15];
        double[] valorCompra = new double[15];
        double valorP = 0;
        double valorV = 0;

        for(int i = 0; i < transacao.length; i++){
            System.out.println("Informe se a transação foi à vista (V) ou à prazo (P): ");
            transacao[i] = scanner.next();

            System.out.println("Informe o valor da compra: ");
            valorCompra[i] = scanner.nextDouble();

            if(transacao[i].equalsIgnoreCase("v")){
                valorV+= valorCompra[i];
            } else if (transacao[i].equalsIgnoreCase("p")){
                valorP+= valorCompra[i];
            } else{
                System.out.println("Digite V ou P!");
            }
        }

        double valorT= valorP + valorV;
        System.out.println("O valor total das compras à vista foi: " + valorV + " \n O valor total das compras à prazo foi: " + valorP + " \n O valor total das compras foi: " + valorT);
        System.out.println("O valor total da 1ª prestação de todas as compras à prazo é: " + valorP / 3);
    }
}
