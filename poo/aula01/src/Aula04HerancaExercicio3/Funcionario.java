package Aula03EncapsulamentoExercicio3;

public class Funcionario extends Pessoa {
    private String cargo;
    private float salario;

    public Funcionario(String nome, String cpf, String rg, String cargo, float salario){
        super(nome, cpf, rg);
        this.cargo = cargo;
        this.salario = salario;
    }

}
