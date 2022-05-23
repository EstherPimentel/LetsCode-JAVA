package Exercicio4Heranca;

public class Disciplina {
    //atributo
    String nome;
    int nota;

    //construtor 1
    public Disciplina(String nome){
        this.nome = nome;
        this.nota = 0;
    }

    //construtor 2
    public Disciplina(String nome, int nota){
        this.nome = nome;
        this.nota = nota;
    }
}
