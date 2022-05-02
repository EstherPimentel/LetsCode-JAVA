package aula05;

import java.util.Scanner;

/*
Crie uma agenda que armazena, código da pessoa, número do telefone, idade. Sua agenda deve possibilitar:
(1) – inserir um contato
(2) – Remover um contato

 */

/*
public class inserirRemoverContato {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int opcaoDigitada = 0;
        String contatos[][] = new String[10][3];
        do {
            opcaoDigitada = exibirMenu(scanner);
            if (opcaoDigitada == 1) {
                System.out.println("Digite o código da pessoa: ");
                scanner.nextLine();
                String codigo = scanner.nextLine();

                System.out.println("Digite a idade do contato: ");
                int idade = scanner.nextInt();
            }

        } while (opcaoDigitada != 3);



        public static int exibirMenu(Scanner scanner) {
            System.out.println("1- Cadastrar contato: ");
            System.out.println("2- Remover contato");
            System.out.println();
            System.out.println("Digite a opção desejada");
            return scanner.nextInt();
        }

}

*/