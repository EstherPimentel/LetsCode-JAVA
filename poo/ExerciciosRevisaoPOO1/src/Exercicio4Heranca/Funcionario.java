package Exercicio4Heranca;

public class Funcionario extends Pessoa{
    //atributo
    private  String cargo;
    private float salario;

    //construtor


    public Funcionario(String nome, String cpf, String rg, String cargo, float salario) {
        super(nome, cpf, rg);
        this.cargo = cargo;
        this.salario = salario;
    }

    //getters and setters
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}
