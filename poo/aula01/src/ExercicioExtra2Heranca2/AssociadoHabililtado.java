package ExercicioExtra2Heranca2;

public class AssociadoHabililtado extends Associado{

    private double custoPiscina;
    private boolean habilitado;


    public AssociadoHabililtado(String numero, String nome, double valor, String atividade, double custoPiscina) {
        super(numero, nome, valor, atividade);
        this.custoPiscina = custoPiscina;
        this.habilitado = habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    /*
    OPÇÃO 1
    @Override
    public double custoMensal() {
        if(this.habilitado)
            return super.custoMensal() + this.custoPiscina;
        else
            return super.custoMensal();
    }


    OPÇÃO 2 quando o método é público não precisa do super, mas é bom colocar para referenciar à classe Pai.
    @Override
    public double custoMensal() {
        if(this.habilitado)
            return super.getValorMensal() + this.custoPiscina;
        else
            return super.getValorMensal();
    }
     */

    //OPÇÃO 3
    @Override
    public double custoMensal() {
        if(this.habilitado)
            return super.valorMensal + this.custoPiscina;
        else
            return super.valorMensal;
    }

}
