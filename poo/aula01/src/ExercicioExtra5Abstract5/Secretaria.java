package ExercicioExtra5Abstract5;

public class Secretaria extends Funcionario{



    public Secretaria(String nome, String sobrenome, String cpf, double salario) {
        super(nome, sobrenome, cpf, salario);
    }

    @Override
    public void pagamento() {
        System.out.println("Seu pagamento será de " + getSalario());
    }
}
