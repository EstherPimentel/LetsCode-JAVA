package Exercicio7InterfaceAbstracao;

import java.util.ArrayList;
import java.util.List;

public abstract class Tabuleiro implements ITabuleiro{

    protected int jogador;
    protected List<Jogador> jogadores = new ArrayList<>();
    protected List <Carta[]>decks = new ArrayList<>();
    protected List <CartaAtaque[]> ataque = new ArrayList<>();
    protected int numeroDecks;
    protected int cartasAtaque;

}
