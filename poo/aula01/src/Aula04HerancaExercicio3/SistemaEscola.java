/*
package Aula03;

import java.util.ArrayList;

public class SistemaEscola {
    ArrayList<Aluno>alunos;
    ArrayList<Funcionario> funcionarios;
    ArrayList<Professor> professores;

    public SistemaEscola(ArrayList<Aluno> alunos, ArrayList<Funcionario> funcionarios, ArrayList<Professor> professores) {
        this.alunos = alunos;
        this.funcionarios = funcionarios;
        this.professores = professores;
    }

    public boolean verificaNovoProfessor(Professor professor){
        for (Professor entrada : professores) {
            if (entrada.cpf.equals(professores.cpf)){
                return false;
            }
        }
        return true;
    }

    public boolean verificaNovoAluno(Aluno aluno){
        for (Aluno entrada : alunos) {
            if (entrada.cpf.equals(aluno.cpf)){
                return false;
            }
        }
        return true;
    }

    public void adicionarAluno(String nome,
                               String cpf,
                               String rg,
                               String matricula,
                               int idade,
                               String turma,
                               ArrayList<Disciplina> disciplinas
    ){
        Aluno aluno = new Aluno(nome, cpf, rg, matricula, idade, turma, disciplinas);
        boolean novoAluno = verificaNovoAluno(aluno);
        if (novoAluno){
            alunos.add(aluno);
        }

    }

    public void adicionarFuncionario(String nome,
                               String cpf,
                               String rg,
                               String cargo,
                               float salario
    ){
        Aluno aluno = new Aluno(nome, cpf, rg, cargo, salario);
        boolean novoFuncionario = verificaNovoFuncionario(funcionario);
        if (novoFuncionario){
            funcionarios.add(funcionario);
        } else{
            modificarFuncionario();
        }

    }

    public void adicionarProfessor(String nome,
                                     String cpf,
                                     String rg,
                                     float salario,
                                   ArrayList<String> turmas,
                                   ArrayList<Disciplina> disciplinas
    ){
        Professor professor = new Professor(nome, cpf, rg, salario, turmas, disciplinas);
        boolean novoProfessor = verificaNovoProfessor(professor);
        if(novoProfessor){
            professores
        }
    }

    public void modificarAluno(String cpf, Aluno aluno){
        for(Aluno entrada: alunos){
            if (entrada.cpf.equals(cpf)) {
                entrada = aluno;
            }
        }
    }

    public void modificarFuncionario(String cpf, Funcionario funcionario){
        for(Funcionario entrada: funcionarios){
            if (entrada.cpf.equals(cpf)) {
                entrada = funcionario;
            }
        }
    }

    public void modificarProfessor(String cpf, Professor professor){
        for(Professor entrada: professores){
            if (entrada.cpf.equals(cpf)) {
                entrada = professores;
            }
        }
    }

    public void deletarAluno(String cpf){
        for(Aluno entrada: alunos) {
            if()
        }
    }
}
*/