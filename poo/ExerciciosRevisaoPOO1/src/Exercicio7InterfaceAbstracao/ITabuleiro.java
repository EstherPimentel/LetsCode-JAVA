package Exercicio7InterfaceAbstracao;

public interface ITabuleiro {

    void inserirDeck();

    void verificarCartaAtaque(Carta carta, int numeroJogador);

    void jogadorVencer();
}
