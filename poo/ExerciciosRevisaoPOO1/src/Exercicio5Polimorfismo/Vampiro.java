package Exercicio5Polimorfismo;

public class Vampiro extends Inimigo{

    public Vampiro() {
        tipo= "vampiro";
    }


    @Override
    public void atacar(int dano, Ataque ataque) {
        System.out.println("Você causou " +  dano + " de danos ao adversário com " + ataque);
        System.out.println("Seu personagem está sangrando!");
    }

    @Override
    public void apanhar(int dano, Ataque ataque) {
        System.out.println("Você foi atingido por uma " + ataque + " e seu dano foi de " + dano);
        if(ataque.equals(Ataque.PERFURANTE)){
            System.out.println("Você recebeu um ataque PERFURANTE! Seu dano foi dobrado: " + dano*2);
        }
    }

    @Override
    public void interagir() {
        System.out.println("O que é um homem?");
    }

    @Override
    public String toString() {
        return "Vampiro{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
