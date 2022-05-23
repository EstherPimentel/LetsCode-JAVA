package Exercicio5Polimorfismo;

public class Cobra extends Inimigo{

    public Cobra() {
        tipo= "cobra";
    }

    @Override
    public void atacar(int dano, Ataque ataque) {
        System.out.println("Você causou " +  dano + " de danos ao adversário com " + ataque);
        System.out.println("Seu personagem está envenenado!");
    }

    @Override
    public void apanhar(int dano, Ataque ataque) {
        System.out.println("Você foi atingido por uma " + ataque + " e seu dano foi de " + dano);
        if(ataque.equals(Ataque.PANCADA)){
            System.out.println("Você recebeu um ataque PANCADA! Seu dano foi dobrado: " + dano*2);
        }
    }

    @Override
    public void interagir() {
        System.out.println("Se você acender a chama a maldição acaba.");
    }

    @Override
    public String toString() {
        return "Cobra{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
