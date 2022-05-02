package Questao4;
/*
Crie um método que recebe uma matriz de inteiros e retorna a soma de
todos os elementos da matriz.

 */
public class somaMatriz {
    public static void main(String[] args) {
        int[][] num = {{1,2,3},{4,5,6},{7,8,9}};
        int soma = 0;
        for(int i = 0; i < num.length; i++){
            for( int j = 0; j < num[i].length; j++){
                soma += num[i][j];
            }
        }
        System.out.println("A soma de todos os números do array é: " + soma);
    }
}
