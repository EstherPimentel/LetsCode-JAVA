package ExercicioExtra4Abstract4;

import java.time.LocalDate;

public class ImpressoraCannon extends Impressora{
    public ImpressoraCannon(String modelo, String tipoConexao, LocalDate dataFabricacao, int folhasDisponiveis, double porcTinta) {
        super(modelo, tipoConexao, dataFabricacao, folhasDisponiveis, porcTinta);
    }

    @Override
    String imprimir() {
        return "Seu documento foi impresso pela Cannon!";
    }

    /* @Override
    public boolean precisaTinta() {
        return super.precisaTinta();
    }

     */

    @Override
    public void precisaTinta() {
        System.out.println("Impressora cannon");
    }
}
