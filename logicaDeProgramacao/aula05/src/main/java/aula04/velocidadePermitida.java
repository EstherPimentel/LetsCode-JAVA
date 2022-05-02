package aula04;

import java.util.Scanner;

/*
Leia a velocidade máxima permitida em uma avenida e a velocidade com que o motorista estava dirigindo nela e calcule
a multa que uma pessoa vai receber, sabendo que são pagos:
	a) 50 reais se o motorista estiver ultrapassar em até 10km/h a velocidade permitida
	(ex.: velocidade máxima: 50km/h; motorista a 60km/h ou a 56km/h);

	b) 100 reais, se o motorista ultrapassar de 11 a 30 km/h a velocidade permitida.

	c) 200 reais, se estiver acima de 31km/h da velocidade permitida.

 */
public class velocidadePermitida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double velocidadePermitida = 80;
        double velocidadeMotorista = 0;
        System.out.println("Velocidade do motorista: ");
        velocidadeMotorista = scanner.nextDouble();

        if(velocidadeMotorista > velocidadePermitida && velocidadeMotorista <= velocidadePermitida + 10){
            System.out.println("A multa é de 50 reais");
        } else if (velocidadeMotorista >= velocidadePermitida + 11 && velocidadeMotorista <= velocidadePermitida + 30){
            System.out.println("A multa é de 100 reais");
        } else if(velocidadeMotorista >= velocidadePermitida + 31){
            System.out.println("A multa é de 200 reais");
        } else {
            System.out.println("O motorista está dentro do limite permitido de 80 km/h");
        }

    }
}
