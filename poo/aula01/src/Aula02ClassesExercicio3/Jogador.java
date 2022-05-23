package Aula02Exercicio3;

/*
1) Crie a classe Jogador descrita no “diagrama” abaixo:
a) Cadastrar/Instanciar pelo menos um time completo 11 jogadores.
b) Criar um método que verifica a condição de jogo, ou seja, um método booleano que
retornará true se o jogador está apto a jogar e false se o jogador está suspenso. Note que um
jogador está suspenso pelo 3 cartão amarelo ou quando recebe um cartão vermelho.
c) Em uma outra classe, crie o método main, o qual cadastra os jogadores e ao final imprimirá a
lista do time juntamente com a informação de quem está apto a jogar, conforme a figura abaixo.
(Sobrescrever o método toString())
d) Crie novos métodos na classe Jogador:
● aplicarCartaoAmarelo(int quantidade): void - Aplica a quantidade de cartões
informada ao jogador, adicionalmente pode tornar um jogador suspenso.
● aplicarCartaoVermelho(): void - Aplica um cartão vermelho ao jogador, torna um
jogador suspenso.
● cumprirSuspencao(): void – Esse método vai zerar a quantidade de
cartões e tornar o jogador apto a jogar
● sofrerLesao(): void – Este método vai gerar aleatoriamente um lesão no jogador. A
gravidade da lesão irá se refletir em uma redução da qualidade do jogador, quanto mais
grave maior a redução da qualidade. Crie uma escala de redução de no mínimo 1 ponto
até o máximo de 15% da qualidade total do jogador. Note que a qualidade jamais pode
ficar negativa. A tabela abaixo pode ser utilizada como referência:
● executarTreinamento(): void – A exemplo do método anterior, este método vai
aumentar a qualidade do jogador aleatoriamente em um número entre 1 e 3. Note que
só pode ser executado 1 treinamento antes de cada partida (você deve adicionar um
atributo na classe para poder controlar essa informação).
Obs: Caso queiram, podem representar os atributos cartoesAmarelo e
cartaoVermelho como um novo tipo (Cartao).
 */

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
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
        SimpleDateFormat dateFor = new SimpleDateFormat("dd-MM-yyyy");
            String nascimentoData = dateFor.format(dataNascimento);
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

    /*void sofrerLesao(){
        Random random = new Random();
        int lesao = random.nextInt(100)+1;
        if(lesao >= 1 && lesao <= 5){
        }
    }

     */

    void executarTreinamento(){
        Random random = new Random();
        if(treino == 0){
            int pontos = (random.nextInt(3)+1);
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
        System.out.println(this.posicao + ": " + this.id + " - " + this.nome + " (" + this.apelido + ") - " + retornarDataComoString() + " CONDIÇÃO: " + (verificarCondicaoDeJogo() ? "Não PODE JOGAR": "PODE JOGAR"));
        return retorno;
    }




}
