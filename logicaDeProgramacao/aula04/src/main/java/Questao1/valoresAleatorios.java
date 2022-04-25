package Questao1;

import java.util.Random;

/*Escreva um código para armazenar 10 valores aleatórios até o número 100 do tipo double em um array;
(Você pode utilizar a biblioteca Random: https://dicasdejava.com.br/como-gerar-um-numero-aleatorio-em-java/ )
 */
public class valoresAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        double[] numerosAleatorios = new double[10];

        for(int i = 0; i < 10; i++){
            numerosAleatorios[i] = random.nextDouble() * 100;
        }
        for(double x : numerosAleatorios){
            System.out.println(x);
        }
    }
}
