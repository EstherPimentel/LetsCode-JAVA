package Exercicio7InterfaceAbstracao;

public abstract class Carta{

    private String nome;
    private EnumTipoCarta tipoCarta;
    private float custo;




    public String getNome() {
        return nome;
    }


    public EnumTipoCarta getTipo() {
        return tipoCarta;

    }

    public float getCusto() {
        return custo;
    }



}
