package Questao6;
/*
6. Leia 4 (quatro) números calcule o quadrado para cada um (n²) some todos e exiba o resultado
 */
public class numeroQuadrado {
    public static void main(String[] args) {
        int num1 =5, num2 =7, num3=9, num4=3;
        int soma = (num1*num1)+(num2*num2)+(num3*num3)+(num4*num4);
        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);
        System.out.println("A soma dos 4 números ao quadrado é:" + soma);
    }
}
