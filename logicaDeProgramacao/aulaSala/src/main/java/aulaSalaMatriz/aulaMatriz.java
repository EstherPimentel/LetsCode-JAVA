package aulaSalaMatriz;

public class aulaMatriz {
    public static void main(String[] args) {
        int temperaturasPorEstacao[][] = {{38, 28, 27, 30}, {35, 22, 21, 19}, {41, 37, 35, 33}, {22, 27, 25, 29}};
        String estados[] = {"Brasília", "São Paulo", "Minas"};
        //String estacoes[] = {"Verão", "Inverno", "Primavera", "Outono"};

        for(int i = 0; i < temperaturasPorEstacao.length; i++){
            System.out.printf("ESTADO: %s\n", estados[i]);
            for(int j = 0; j < temperaturasPorEstacao[i].length; j++){
                System.out.println(temperaturasPorEstacao[i][j]);
            }
            System.out.println("\n");
        }
    }
}
