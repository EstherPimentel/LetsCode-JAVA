package Exercicio4Heranca;

import java.util.ArrayList;

public class Escola {
    //atributos
    ArrayList<Aluno> alunos;
    ArrayList<Funcionario> funcionarios;
    ArrayList<Professor> professores;

    //construtor

    public Escola(ArrayList<Aluno> alunos, ArrayList<Funcionario> funcionarios, ArrayList<Professor> professores) {
        this.alunos = alunos;
        this.funcionarios = funcionarios;
        this.professores = professores;
    }

    public int verificarIndexFuncionario(String cpf){
        for(Funcionario funcionario : funcionarios){
            if(funcionario.getCpf().equals(cpf)){
                return funcionarios.indexOf(funcionario); // já existe na lista
            }
        }
        return -1; // funcionário novo
    }

    public void modificarFuncionario(String cpf, String cargo, float salario){
        int indexFuncionario = verificarIndexFuncionario(cpf);
        if(indexFuncionario != -1){
            this.funcionarios.get(indexFuncionario).setCargo(cargo);
            this.funcionarios.get(indexFuncionario).setSalario(salario);
            System.out.println("O cadastro do funcionário foi atualizado!");
        } else {
            System.out.println("O funcionário não está cadastrado no sistema!");
        }
    }

    public void adicionarNovoFuncionario(String nome, String cpf, String rg, String cargo, float salario){
        Funcionario novoFuncionario = new Funcionario(nome, cpf, rg, cargo, salario);
        if(verificarIndexFuncionario(cpf) == -1){
            this.funcionarios.add(novoFuncionario);
            System.out.println("Funcionário cadastrado com sucesso no sistema!");
        } else{
            System.out.println("Funcionário já está cadastrado!");
        }
    }

    public void deletarFuncionario(String cpf){
        if(verificarIndexFuncionario(cpf) != -1){
            this.funcionarios.remove(verificarIndexFuncionario(cpf));
            System.out.println("Cadastro do funcionário removido do sistema.");
        }
    }

    public void listarFuncionarios(){
        int num = 1;
        for(Funcionario funcionario: funcionarios){
            System.out.println(num++ + " - " + funcionario.toString());
            System.out.println(" ");
        }
    }

    public int verificarIndexProfessor(String cpf){
        for(Professor professor : professores){
            if(professor.getCpf().equals(cpf)){
                return professores.indexOf(professor); // já existe na lista
            }
        }
        return -1; //professor novo
    }

    public void modificarProfessor(String cpf, float salario, ArrayList<String> turmas, ArrayList<Disciplina> disciplinas){
        int indexProfessor = verificarIndexProfessor(cpf);
        if(indexProfessor != -1){
            this.professores.get(indexProfessor).setSalario(salario);
            this.professores.get(indexProfessor).setTurmas(turmas);
            this.professores.get(indexProfessor).setDisciplinas(disciplinas);
            System.out.println("O cadastro do professor(a) foi atualizado!");
        } else {
            System.out.println("O(a) professor(a) não está cadastrado(a) no sistema!");
        }
    }

    public void adicionarNovoProfessor(String nome, String cpf, String rg, float salario, ArrayList<String> turmas, ArrayList<Disciplina> disciplinas){
        Professor novoProfessor = new Professor(nome, cpf, rg, salario, turmas, disciplinas);
        if(verificarIndexProfessor(cpf) == -1){
            this.professores.add(novoProfessor);
            System.out.println("Professor(a) cadastrado(a) com sucesso no sistema!");
        } else{
            System.out.println("Professor(a) já está cadastrado(a)!");
        }
    }

    public void deletarProfessor(String cpf){
        if(verificarIndexProfessor(cpf) != -1){
            this.professores.remove(verificarIndexProfessor(cpf));
            System.out.println("Cadastro do(a) professor(a) removido do sistema.");
        }
    }

    public void listarProfessores(){
        int num = 1;
        for(Professor professor: professores){
            System.out.println(num++ + " - " + professor.toString());
            System.out.println(" ");
        }
    }

    public int verificarIndexAluno(String cpf){
        for(Aluno aluno : alunos){
            if(aluno.getCpf().equals(cpf)){
                return alunos.indexOf(aluno); // já existe na lista
            }
        }
        return -1; //aluno novo
    }

    public void modificarAluno(String cpf, int idade, String turma, ArrayList<Disciplina> notas){
        int indexAluno = verificarIndexAluno(cpf);
        if(indexAluno != -1){
            this.alunos.get(indexAluno).setIdade(idade);
            this.alunos.get(indexAluno).setTurma(turma);
            this.alunos.get(indexAluno).setNotas(notas);
            System.out.println("O cadastro do aluno foi atualizado!");
        } else {
            System.out.println("O aluno não está cadastrado no sistema!");
        }
    }

    public void adicionarNovoAluno(String nome, String cpf, String rg, String matricula, int idade, String turma, ArrayList<Disciplina> notas){
        Aluno novoAluno = new Aluno(nome, cpf, rg, matricula, idade, turma, notas);
        if(verificarIndexAluno(cpf) == -1){
            this.alunos.add(novoAluno);
            System.out.println("Aluno cadastrado com sucesso no sistema!");
        } else{
            System.out.println("Aluno já está cadastrado!");
        }
    }

    public void deletarAluno(String cpf){
        if(verificarIndexAluno(cpf) != -1){
            this.alunos.remove(verificarIndexAluno(cpf));
            System.out.println("Cadastro do aluno removido do sistema.");
        }
    }

    public void listarAlunos(){
        int num = 1;
        for(Aluno aluno : alunos){
            System.out.println(num++ + " - " + aluno.toString());
            System.out.println(" ");
        }
    }

    public void calcularMediaAluno(String cpf){
        int indexAluno = verificarIndexAluno(cpf);

        if(indexAluno != -1){
            Aluno aluno = alunos.get(indexAluno);
            float media = aluno.mediaNotas();
            System.out.println("A média das notas de " + aluno.getNome() + " é " + media);
        } else{
            System.out.println("Aluno não encontrado no sistema.");
        }
    }








}
