package ExercicioExtra4Abstract4;

import java.time.LocalDate;

public abstract class Impressora {
    private String modelo;
    private String tipoConexao;
    private LocalDate dataFabricacao;
    private int folhasDisponiveis;
    private double porcTinta;

    public Impressora(String modelo, String tipoConexao, LocalDate dataFabricacao, int folhasDisponiveis, double porcTinta) {
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        this.dataFabricacao = dataFabricacao;
        this.folhasDisponiveis = folhasDisponiveis;
        this.porcTinta = porcTinta;
    }

    public boolean temPapel(){
        if(this.folhasDisponiveis > 0)
            return true;
        else
            return false;
    }

   /* public boolean precisaTinta(){
        if(this.porcTinta <= 0)
            return true;
        else
            return false;
    }

    */

    public void precisaTinta(){
        if(this.porcTinta <= 0)
            System.out.println("Precisa tinta");
        else
            System.out.println("Não precisa tinta");
    }

    abstract String imprimir();
}
