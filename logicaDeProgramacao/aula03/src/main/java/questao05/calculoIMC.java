package questao05;
/*
Escreva um programa que receba o peso e a altura de uma pessoa e calcule o seu IMC,
o resultado irá dizer se a pessoa está: abaixo do peso (IMC inferior a 18,5), com peso normal (IMC entre 18,5 a 24,9),
com excesso de peso (IMC entre 25,0 a 29,9) ou obesa (30 ou mais de IMC), informe cada um deles com uma mensagem.

Use a fórmula: IMC = Peso / (Altura × Altura)
*/

import java.util.Scanner;

public class calculoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();
        double imc = peso / (altura * altura);
        if(imc < 18.5){
            System.out.println("Seu imc é " + imc + ". Você está abaixo do peso" );
        } if(imc >= 18.5 && imc < 24.9){
            System.out.println("Seu imc é " + imc + ". Você está dentro do peso");
        } if(imc >= 25.0 && imc < 29.9){
            System.out.println("Seu imc é " + imc + ". Você está acima do peso");
        } if(imc >= 30.0){
            System.out.println("Seu imc é " + imc + ". Você está no nível obeso");
        }

    }
}
