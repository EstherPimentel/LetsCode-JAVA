package Exercicio5Polimorfismo;

public class Gigante extends Inimigo{

    public Gigante() {
        tipo= "gigante";
    }


    @Override
    public void atacar(int dano, Ataque ataque) {
        System.out.println("Você causou " +  dano + " de danos ao adversário com " + ataque);
        System.out.println("Seu personagem está atordoado!");
    }

    @Override
    public void apanhar(int dano, Ataque ataque) {
        System.out.println("Você foi atingido por uma " + ataque + " e seu dano foi de " + dano);
        if(ataque.equals(Ataque.FOGO)){
            System.out.println("Você recebeu um ataque de FOGO! Seu dano foi dobrado: " + dano*2);
        }
    }

    @Override
    public void interagir() {
        System.out.println("Me desculpe!");
    }

    @Override
    public String toString() {
        return "Gigante{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
