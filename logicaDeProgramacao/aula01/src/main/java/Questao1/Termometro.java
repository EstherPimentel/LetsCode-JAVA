package Questao1;

public class Termometro {
    public double kelvin(double celsius){
        return celsius + 273.15;
    }
    public double fahrenheit(double celsius){
        return celsius * 1.8 + 32;
    }
    public double rankine(double celsius){
        return celsius * 1.8 + 32 + 459.67;
    }
    public double reaumur(double celsius){
        return celsius * 0.8;
    }
}
