package Aula02Exercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContaCorrente {
    private int numero;
    private double saldo;
    private List<String> numerosCartoes = new ArrayList<>();

    public ContaCorrente() {
        //construtor vazio
    }

    public List<String> getNumerosCartoes() {
        return Collections.unmodifiableList(numerosCartoes);
    }

    public ContaCorrente(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    void sacar(double quantidade){
        if(this.saldo + 1 > quantidade) {
            this.saldo -= quantidade + 1;
        }
    }
}
