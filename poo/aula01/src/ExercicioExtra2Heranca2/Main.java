package ExercicioExtra2Heranca2;

public class Main {
    public static void main(String[] args) {
        Associado associado = new Associado("123", "Esther", 80, "musculação");
        AssociadoHabililtado associadoHabililtado = new AssociadoHabililtado("345", "JP", 99, "dança", 25);

        associadoHabililtado.setHabilitado(true);
        associadoHabililtado.valorMensal = 150; //consigo usar diretamente o atributo valorMensal sem get e nem set porque ele está como protected
                                                    //na classe Associado.

        System.out.println(associado.custoMensal());
        System.out.println(associadoHabililtado.custoMensal());
    }
}
