package Exercicio4Heranca;

import java.util.ArrayList;

public class Professor extends Funcionario{
    //atributo
    private ArrayList<String> turmas;
    private ArrayList<Disciplina> disciplinas;

    //construtor
    public Professor(String nome, String cpf, String rg, float salario, ArrayList<String> turmas, ArrayList<Disciplina> disciplinas) {
        super(nome, cpf, rg, "professor", salario);
        this.turmas = turmas;
        this.disciplinas = disciplinas;
    }

    public ArrayList<String> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<String> turmas) {
        this.turmas = turmas;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "turmas=" + turmas +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
