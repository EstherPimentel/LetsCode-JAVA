package Exercicio2Classes;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador(1, "Nome do Jogador", "Apelido",  LocalDate.of(1976, 11, 20), 11, "posição", 12);
        Jogador jogador2 = new Jogador(1, "Nome do Jogador", "Apelido",  LocalDate.of(1976, 11, 20), 11, "posição", 12);
        Jogador jogador3 = new Jogador(1, "Nome do Jogador", "Apelido",  LocalDate.of(1976, 11, 20), 11, "posição", 12);
        Jogador jogador4 = new Jogador(1, "Nome do Jogador", "Apelido",  LocalDate.of(1976, 11, 20), 11, "posição", 12);


        jogador1.aplicarCartaoAmarelo(2);
        jogador2.aplicarCartaoVermelho();
        jogador3.cumprirSuspencao();
        jogador4.executarTreinamento();

        System.out.println(jogador1);
        System.out.println(jogador2);
        System.out.println(jogador3);
        System.out.println(jogador4);

    }
}
