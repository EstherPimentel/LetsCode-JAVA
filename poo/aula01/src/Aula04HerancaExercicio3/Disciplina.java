package Aula03EncapsulamentoExercicio3;

public class Disciplina {
    String nome;
    int nota;

    public Disciplina(String nome){
        this.nome = nome;
        this.nota = 0;
    }

    public Disciplina(String nome, int nota){
        this.nome = nome;
        this.nota = nota;
    }
}
