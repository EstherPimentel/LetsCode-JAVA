package Aula02Exercicio1;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.horasTrabalhadas = 32;
        funcionario.valorPorHora = 90d;
        funcionario.incrementaHoras(10);
        funcionario.calcularSalario();
        funcionario.nomeCompleto();

        Funcionario funcionario1 = new Funcionario("Luis", "Silva");
        funcionario.horasTrabalhadas = 10;
        funcionario.valorPorHora = 25.50;
        funcionario.incrementaHoras(8);
        funcionario.calcularSalario();
    }
}
