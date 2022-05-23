package Aula03EncapsulamentoExercicio3;

public class Aluno extends Pessoa{
    String matricula;
    int idade;
    String turma;
    Disciplina[] notas;

    Aluno(String nome, String cpf, String rg, String matricula, int idade, String turma, Disciplina[] disciplinas) {
        super(nome, cpf, rg);
        this.matricula = matricula;
        this.idade = idade;
        this.turma = turma;
        this.notas = disciplinas;
    }
}
