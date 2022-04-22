package Questao3;

public class questao03_GReis {
    public static void main(String[] args) {

                String[] nomes = {"Aline","Mário","Sérgio","Shirley"};
                String[] notas = {"9.0", "Dez", "4.5", "7.0"};

                System.out.print("Aluno(a)");
                System.out.print("          ");
                System.out.println("Nota");
                System.out.print("========");
                System.out.print("          ");
                System.out.println("====");

                for (int i = 0; i < nomes.length; i++) {
                    System.out.print(nomes[i]);
                    for(int x = nomes[i].length(); x < (22-notas[i].length()); x++) {
                        System.out.print(" ");
                    }
                    System.out.println(notas[i]);
                }

            }

        }


