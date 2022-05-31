package ExercicioExtra4Abstract4;

import java.time.LocalDate;

public class ImpressoraEpson extends Impressora{

    public ImpressoraEpson(String modelo, String tipoConexao, LocalDate dataFabricacao, int folhasDisponiveis, double porcTinta) {
        super(modelo, tipoConexao, dataFabricacao, folhasDisponiveis, porcTinta);
    }

    @Override
    String imprimir() {
        return "Seu documento foi impresso!";
    }
}
