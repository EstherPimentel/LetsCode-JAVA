package ExercicioExtra2Heranca2;

public class Associado {
    // usar protected com herança é importante tomar cuidado com as outras classes que estarão no mesmo pacote da classe pai.
    // Porque se tenho uma terceira classe como a classe Principal(main), ela está no mesmo pacote que a classe associado
    // e aí pode fazer uso direto desse esse atributo valor mensal.

    private String numAssociado;
    private String nome;
    /* OPÇÃO 1 E OPÇÃO 2: private e OPÇÃO 3 usa:*/protected double valorMensal;
    private String atividade;

    public Associado(String numero, String nome, double valor, String atividade) {
        this.numAssociado = numero;
        this.nome = nome;
        this.valorMensal = valor;
        this.atividade = atividade;
    }


    //OPÇÃO 1
    public double custoMensal(){
        return this.valorMensal;
    }


    // OPÇÃO 2 Se for chamar esse método em outro lugar fora da classe associadoHabilitado, aí precisa desse get, se não, pode apagar.
    public double getValorMensal() {
    return valorMensal;
    }

}
