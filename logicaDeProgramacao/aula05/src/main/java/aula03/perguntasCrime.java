package aula03;

import java.util.Scanner;

/*
Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
“Telefonou para a vítima? “
“Esteve no local do crime?”
“Mora perto da vítima? “
“Devia para a vítima? “
“Já trabalhou com a vítima? “
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como “Suspeita”,
entre 3 e 4 como “Cúmplice” e 5 como “Assassino”.
Caso contrário, ela será classificada como “Inocente”.

 */
public class perguntasCrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Responda as seguintes perguntas apenas com SIM ou NÃO: " );

        int count = 0;

        String[] perguntas = new String[5];
        perguntas[0] = "Telefonou para a vítima?";
        perguntas[1] = "Esteve no local do crime?";
        perguntas[2] = "Mora perto da vítima?";
        perguntas[3] = "Devia para a vítima?";
        perguntas[4] = "Já trabalhou com a vítima?";

        for(int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]); //exibe a pergunta
            String respostas = scanner.nextLine(); //captura a resposta do usuário

            /*if (!respostas.equalsIgnoreCase("sim") || !respostas.equalsIgnoreCase("não")) {
                System.out.println("Digite apenas sim ou não!");
                respostas = scanner.nextLine();
            } else {break;} */

            if (respostas.equalsIgnoreCase("sim")) {
                count++;
            }

        }

        switch(count){
            case 2: // caso o número de respostas positivas seja 2
                System.out.println("Suspeito");
                break;

            case 3:// caso o número de respostas positivas seja 3 ou 4
            case 4:
                System.out.println("Cúmplice");
                break;

            case 5:// caso o número de respostas positivas seja 5
                System.out.println("Assassino");
                break;

            default:// caso o número de respostas positivas não seja nenhuma das outras opções
                System.out.println("Inocente");
                break;
        }
    }
}
