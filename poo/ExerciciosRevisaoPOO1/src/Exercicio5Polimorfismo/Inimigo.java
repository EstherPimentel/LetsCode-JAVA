package Exercicio5Polimorfismo;

public abstract class Inimigo {

    protected String tipo;

    public abstract void atacar(int dano, Ataque ataque);
    public abstract void apanhar(int dano, Ataque ataque);
    public abstract void interagir();


    public Inimigo(){

    }



}
