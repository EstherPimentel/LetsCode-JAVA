package ExercicioExtra5Abstract5;

public class Gerente extends Funcionario{


    private double bonus;

    public Gerente(String nome, String sobrenome, String cpf, double salario, double bonus) {
        super(nome, sobrenome, cpf, salario);
        this.bonus = bonus;
    }

    @Override
    public void pagamento() {
        double valor = getSalario() + this.bonus;
        System.out.println("Seu pagamento será de " + valor);
    }
}
