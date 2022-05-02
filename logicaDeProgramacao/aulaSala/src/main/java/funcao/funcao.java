package funcao;

public class funcao {


        public static void main(String[] args) {
            String nome= "Esther";
            exibirNome(nome);
            double resultado = divisao(10, 2);
            System.out.println("O resultado da divisão foi: " + resultado);
        }

        public static void exibirNome(String nome) {
            System.out.println("Hello word! " + nome);
        }

        public static double divisao(int operadorA, int operadorB) {
            return operadorA / operadorB;
        }
    }

