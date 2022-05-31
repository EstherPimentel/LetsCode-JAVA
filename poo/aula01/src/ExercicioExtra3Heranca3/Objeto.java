package ExercicioExtra3Heranca3;

public class Objeto {
    //atributos
    private int posx;
    private int posy;
    private char direcao;

//construtor
    public Objeto(int posx, int posy, char direcao) {
        this.posx = posx;
        this.posy = posy;
        this.direcao = direcao;
    }

//método
    public void irA(int x, int y, char direcao){
        System.out.println("O objeto está em movimento");
    }
}
