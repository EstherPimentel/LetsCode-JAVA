package ExercicioExtra3Heranca3;

public class Asteroide extends Objeto {
//atributos
    private int danos;
//construtor
    Asteroide(int posx, int posy, char direcao, int danos){
        super(posx, posy, direcao);
        this.danos = danos;
    }
//sobrescrever
    @Override
    public String toString() {
        return "Asteroide{" +
                "danos=" + danos +
                '}';
    }
}
