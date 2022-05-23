package Aula02;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private int idade;
    private double alturaCentimetros;
    private double pesoQuilogramas;
    private SexoEnum sexo;
    private LocalDate dataCadastro;
    private Boolean estaAtivo;

    Pessoa() {
        dataCadastro = LocalDate.now();
        estaAtivo = true;
    }

    Pessoa(String nome, int idade, double alturaCentimetros, double pesoQuilogramas, SexoEnum sexo, LocalDate dataCadastro, Boolean estaAtivo){
        this.nome = nome;
        this.idade = idade;
        this.alturaCentimetros = alturaCentimetros;
        this.pesoQuilogramas = pesoQuilogramas;
        this.sexo = sexo;
        this.dataCadastro = dataCadastro;
        this.estaAtivo = estaAtivo;

    }

    public void falar(){
        System.out.println(this.nome + " está falando");
    }

    public void comer(){
        System.out.println(this.nome + " está comendo");
    }

    public void dormir(){
        System.out.println(this.nome + " está dormindo");
    }

    public static void quemSou(){
        System.out.println("Eu sou uma pessoa");
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    @Override
    public String toString(){
        return "Pessoa{" +
                "nome='" + this.nome + '\'' +
                ", idade=" + this.idade +
                ", alturaCentimetros=" + this.alturaCentimetros +
                ", pesoQuilogramas=" + this.pesoQuilogramas +
                ", sexo=" + this.sexo +
                '}';
    }
}
