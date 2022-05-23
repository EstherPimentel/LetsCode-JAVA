package Exercicio4Heranca;

import java.util.ArrayList;

public class Aluno extends Pessoa{
    //atributo
    private String matricula;
    private int idade;
    private String turma;
    private ArrayList<Disciplina> notas;

    public Aluno(String nome, String cpf, String rg, String matricula, int idade, String turma, ArrayList<Disciplina> disciplinas) {
        super(nome, cpf, rg);
        this.matricula = matricula;
        this.idade = idade;
        this.turma = turma;
        this.notas = disciplinas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public ArrayList<Disciplina> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Disciplina> notas) {
        this.notas = notas;
    }

    public int mediaNotas(){
        int total = 0;
        for(Disciplina disciplina: notas){
            total += disciplina.nota;
        }
        return total/notas.size();
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", idade=" + idade +
                ", turma='" + turma + '\'' +
                ", notas=" + notas +
                '}';
    }
}
