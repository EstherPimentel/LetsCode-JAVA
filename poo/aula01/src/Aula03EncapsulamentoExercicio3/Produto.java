package Aula03EncapsulamentoExercicio3;

public class Produto {
    private String nomeProduto;
    private String sessaoProduto;
    private String tipoProduto;
    private int quantemEstoque;
    private String marcaProduto;
    private Long idProduto;
    private static long contadorProduto;


    Produto(String nomeProduto, String sessaoProduto, String tipoProduto, int quantemEstoque, String marcaProduto){
        contadorProduto++;
        this.idProduto = contadorProduto;
        this.nomeProduto = nomeProduto;
        this.sessaoProduto = sessaoProduto;
        this.tipoProduto = tipoProduto;
        this.quantemEstoque = quantemEstoque;
        this.marcaProduto = marcaProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getQuantemEstoque() {
        return quantemEstoque;
    }

    public void setQuantemEstoque(int quantemEstoque) {
        this.quantemEstoque = quantemEstoque;
    }

    public String getMarcaProduto() {
        return marcaProduto;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nomeProduto='" + nomeProduto + '\'' +
                ", sessaoProduto='" + sessaoProduto + '\'' +
                ", tipoProduto='" + tipoProduto + '\'' +
                ", quantemEstoque=" + quantemEstoque +
                ", marcaProduto='" + marcaProduto + '\'' +
                ", idProduto=" + idProduto +
                '}';
    }
}



