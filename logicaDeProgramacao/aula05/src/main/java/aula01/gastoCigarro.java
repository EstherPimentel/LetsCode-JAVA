package aula01;
/*Calcular a quantidade de dinheiro gasta por um fumante.
Dados: o número de anos que ele fuma, o nº de cigarros fumados por dia e o preço de uma carteira com 20 cigarros.

 */
public class gastoCigarro {
    public static void main(String[] args) {

        double totalGasto = 0;
        int anosFumo= 10;
        int cigDia = 40;
        double carteiraCig = 7.99;

        int tempoFumanteDias = anosFumo * 365;
        int totalCigarrosFumados = tempoFumanteDias * cigDia;
        double carteirasFumadas = totalCigarrosFumados / 20 ;
        totalGasto = (carteirasFumadas * carteiraCig);
        System.out.println("O total gasto foi de: " + totalGasto);

    }

}
