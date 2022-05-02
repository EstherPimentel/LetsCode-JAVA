package questao04;

import java.util.Scanner;

/*
4.	Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes de trânsito.
Foram obtidos os seguintes dados:

1.	Código da cidade;
2.	Número de veículos de passeio (em 2021);
3.	Número de acidentes de trânsito com vítimas (em 2021). Deseja-se saber:

a.	Qual o maior e menor índice de acidentes de trânsito e a que cidade pertence;
b.	Qual a média de veículos nas cinco cidades juntas;
c.	Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.

 */
public class acidentesTransito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int indiceMaior = 0;

        for(int i = 0; i < 5; i++);
        System.out.println("Insira o código da cidade: ");
        int codigo = scanner.nextInt();

        System.out.println("Insira o total de veículos de passeio em 2021: ");
        int veiculos = scanner.nextInt();

        System.out.println("Insira o número de acidente de trânsito com vítimas" );
        int acidentes = scanner.nextInt();



    }
}
