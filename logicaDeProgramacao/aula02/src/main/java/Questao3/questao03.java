package Questao3;

/*
3. Escreva um programa que produza a seguinte saída na tela:
*/

public class questao03 {
    public static void main(String[] args) {
        String[] nomes = {"Aluno(a)", "=========","Aline","Mário","Sérgio","Shirley"};
        String[] notas = {"Nota", "=====", "9.0", "Dez", "4.5", "7.0"};


        for (int i = 0; i < nomes.length; i++) {
            System.out.print(nomes[i]);
            for(int x = nomes[i].length(); x < notas.length; x++) {
                System.out.print(" ");
            }
            System.out.println(notas[i]);
        }

    }

}
