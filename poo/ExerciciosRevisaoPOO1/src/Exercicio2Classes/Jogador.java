package Exercicio2Classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Jogador {
    //ATRIBUTOS DA CLASSE
    int id;
    String nome;
    String apelido;
    LocalDate dataNascimento;
    int numero;
    String posicao;
    int qualidade;
    int cartoesAmarelos;
    int cartaoVermelho;
    boolean suspenso;
    int treino;

    //CONSTRUTORES DA CLASSE JOGADOR
    public Jogador() {
        //construtor vazio
    }

    public Jogador(int id, String nome, String apelido, LocalDate dataNascimento, int numero, String posicao, int qualidade) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;

    }

    //MÉTODOS

    /**
     * LocalDate é uma classe que já existe para data
     * dataNascimento é a variável que recebe LocalDate e que será formatada
     * nascimentoData é o nome que eu dei para a variável que vai receber o novo formato da data
     * SimpleDateFormat é uma classe que já existe pra formatar data
     * dateFor é o nome que eu dei para a váriavel que formata data para String no formato dia/mês/ano
     */
    String retornarDataComoString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String nascimentoData = dataNascimento.format(formatter);
        return nascimentoData;
    }

    boolean verificarCondicaoDeJogo() {
        if (cartoesAmarelos == 3 || cartaoVermelho == 1) {
            this.suspenso = true;
        }
        return this.suspenso;
    }

    void aplicarCartaoAmarelo(int quantidade) {
        this.cartoesAmarelos += quantidade;
        verificarCondicaoDeJogo();
    }

    void aplicarCartaoVermelho(){
        this.cartaoVermelho = 1;
        verificarCondicaoDeJogo();
    }

    void cumprirSuspencao(){
        cartoesAmarelos = 0;
        cartaoVermelho = 0;
    }

    /* void sofrerLesao(){
        Random random = new Random();
        int lesao = random.nextInt(100);
        if(lesao >= 1 && lesao <= 5){
        }
    }
    */


    void executarTreinamento(){
        Random random = new Random();
        if(treino == 0){
            int pontos = (random.nextInt(3));
            qualidade+= pontos;
            treino += 1;
            System.out.println("A qualidade do jogador " + nome + " aumentou " + pontos + " pontos e sua qualidade é " + qualidade + " após " + treino + " treino.");
        } else{
            System.out.println("O jogador " + nome + " já treinou para o próximo jogo!");
        }

    }

    @Override
    public String toString() {
        String retorno = "";
        System.out.println(this.posicao + ": " + this.id + " - " + this.nome + " (" + this.apelido + ") - " + retornarDataComoString() + " CONDIÇÃO: " + (verificarCondicaoDeJogo() ? "NÃO PODE JOGAR": "PODE JOGAR"));
        return retorno;
    }
}
