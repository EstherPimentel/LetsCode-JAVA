package ExercicioExtra3Heranca3;

public class Nave extends Objeto{
    //atributo
    private double velocidade;
    private int vida;

    //construtor
    Nave(int posx, int posy, char direcao, double velocidade, int vida){
        super(posx, posy, direcao);
        this.velocidade = velocidade;
        this.vida = vida;
    }

    //método
    public void girar(char direcao){
        System.out.println("A nave girou na direção " + direcao);
    }

    //método
    public String restaVida (int valor){
        return "Ainda resta " + valor + " de vida";
    }

    //sobrescrever
    @Override
    public String toString() {
        return "Nave{" +
                "velocidade=" + velocidade +
                ", vida=" + vida +
                '}';
    }
}
