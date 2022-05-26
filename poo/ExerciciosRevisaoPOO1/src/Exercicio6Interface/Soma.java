package Exercicio6Interface;

public class Soma implements ICalculo {

    @Override
    public double calcular(double... numeros) {
        double resultado = 0;
        for (double numero: numeros) {
            resultado += numero;

        }
        return resultado;
    }
}
