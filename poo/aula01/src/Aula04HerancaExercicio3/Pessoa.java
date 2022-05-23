package Aula03EncapsulamentoExercicio3;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected String rg;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }
}
