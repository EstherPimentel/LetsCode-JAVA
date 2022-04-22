package questao10;

import java.util.Random;
import java.util.Scanner;

/*

Escreva um programa que gera um número inteiro aleatório entre 1 e 10 e peça que o usuário informe o número correto,
você deve dar dicas caso o palpite esteja errado, informando se o número correto é maior ou menor do que o informado,
  caso ele erre três vezes o programa se encerra e imprime uma mensagem informando que ele perdeu.

 */
public class numeroAleatorio {
    public static void main(String[] args) {
        Random random = new Random();
        int numSorteio = random.nextInt(10);

        Scanner scanner = new Scanner(System.in);

            System.out.println("Estou pensando em um número entre 1 e 10. Tente adivinhar qual é: ");
        for(int i=1; i<4;i++ ) {
            int numUsuario = scanner.nextInt();

            if (numUsuario > numSorteio) {
                System.out.println("O número que estou pensando é menor que o informado.");
            } else if (numUsuario < numSorteio){
                System.out.println("O número que estou pensando é maior que o informado");
            } else if (numUsuario == numSorteio){
                System.out.println("Você acertou!");
            }
        }
        System.out.println("Você perdeu! O número correto é: " + numSorteio);
    }
}
