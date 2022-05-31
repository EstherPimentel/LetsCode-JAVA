package Exercicio7InterfaceAbstracao;

import java.util.ArrayList;
import java.util.List;

public class TabuleiroVersus extends Tabuleiro{

    private int cartaAtaqueJogador1 = 0;
    private int cartaAtaqueEspecialJogador1 = 0;
    private int cartaAtaqueJogador2 = 0;
    private int cartaAtaqueEspecialJogador2 = 0;





    @Override
    public void inserirDeck() {
        if (numeroDecks < 2){
           this.decks.add(new Carta[50]);
           numeroDecks++;
        } else {
            System.out.println("Há dois jogadores à mesa");
        }

    }

    @Override
    public void verificarCartaAtaque(Carta carta, int numeroJogador) {
        if(carta instanceof CartaAtaqueEspecial){
            if(numeroJogador ==1){
                if(cartaAtaqueEspecialJogador1 <2){
                    System.out.println("Você pode jogar uma carta");
                    cartaAtaqueEspecialJogador1++;
                } else {
                    System.out.println("Você não pode jogar mais cartas especiais");
                }
            }

            if(numeroJogador ==2){
                if(cartaAtaqueEspecialJogador2 <2){
                    System.out.println("Você pode jogar uma carta");
                    cartaAtaqueEspecialJogador2++;
                } else {
                    System.out.println("Você não pode jogar mais cartas especiais");
                }
            }
        }

        else if(carta instanceof CartaAtaque){
            if(numeroJogador ==1){
                if(cartaAtaqueJogador1 <5){
                    System.out.println("Você pode jogar uma carta");
                    cartaAtaqueJogador1++;
                } else {
                    System.out.println("Você não pode jogar mais cartas");
                }
            }

            if(numeroJogador ==2){
                if(cartaAtaqueJogador2 <5){
                    System.out.println("Você pode jogar uma carta");
                    cartaAtaqueJogador2++;
                } else {
                    System.out.println("Você não pode jogar mais cartas");
                }
            }
        }

    }

    @Override
    public void jogadorVencer() {
        if(jogadores.get(0).getVida() == 0 || jogadores.get(1).getVida() == 0){
            System.out.println("O jogo acabou!");
        }

    }





}
