package Exercicio7InterfaceAbstracao;

public class TabuleiroParty extends Tabuleiro{

    private int cartasEmJogo=0;



    @Override
    public void inserirDeck() {
        if (numeroDecks < 5){
            this.decks.add(new Carta[80]);
            numeroDecks++;
        } else {
            System.out.println("Há 5 jogadores à mesa");
        }
    }

    @Override
    public void verificarCartaAtaque(Carta carta, int numeroJogador) {
        if(cartasEmJogo < 34){
            System.out.println("O jogador" + numeroJogador + " pode jogar uma carta!" + carta.getNome());
        } else {
            System.out.println("Jogador" + numeroJogador + "não pode jogar a carta" + carta.getNome());
        }
    }

    @Override
    public void jogadorVencer() {
        int jogadorMorto=0;
        for (Jogador jogador: jogadores) {
            if(jogador.getVida() == 0){
                jogadorMorto++;
            }
        }
        if(jogadorMorto >= 4){
            System.out.println("O jogo acabou!");
        }
    }
}
