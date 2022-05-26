package Exercicio6Interface;

public class Divisao implements ICalculo {

    @Override
    public double calcular(double... numeros) {
        double resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultado /= numeros[i];
        }
        return resultado;
    }
}