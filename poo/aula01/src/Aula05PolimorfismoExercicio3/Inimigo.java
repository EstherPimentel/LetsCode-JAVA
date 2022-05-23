package Aula05PolimorfismoExercicio3;

public abstract class Inimigo {

    private int vida;
    public abstract void atacar(Heroi heroi);
    public abstract void apanhar(int dano, TipoAtaque tipoAtaque);
    public abstract void interagir();


    public Inimigo(){

    }

}
