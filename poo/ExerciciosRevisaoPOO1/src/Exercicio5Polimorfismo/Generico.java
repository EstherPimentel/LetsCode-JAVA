package Exercicio5Polimorfismo;

public class Generico extends Inimigo{

    public Generico() {
        tipo = "genérico";
    }

    @Override
    public void atacar(int dano, Ataque ataque) {
        System.out.println("Você causou " +  dano + " de danos ao adversário com " + ataque);

    }

    @Override
    public void apanhar(int dano, Ataque ataque) {
        System.out.println("Você foi atingido por uma " + ataque + " e seu dano foi de " + dano);
    }

    @Override
    public void interagir() {
        System.out.println("Você precisa de aliados");
    }
}
