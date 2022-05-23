package Exercicio3Encapsulamento;

import java.util.ArrayList;

public class Estoque {
    //Um estoque deve ter um nome, uma lista de produtos e um identificador único.

    private Long idEstoque;
    private static long contadorEstoque = 0;
    public String nomeEstoque; //Public = A única variável do estoque que o usuário conseguirá acessar e modificar livremente será o nome.
    private ArrayList<Produto> produtoList = new ArrayList<>();


    Estoque(String nomeEstoque ){
        contadorEstoque++;
        this.idEstoque = contadorEstoque;
        this.nomeEstoque = nomeEstoque;

    }

    public void adicionarProduto(Produto novoProduto){
        int quantidadeNovoProduto = novoProduto.getQuantemEstoque();
        for(Produto produto : produtoList){
            if(novoProduto.getMarcaProduto().equals(produto.getMarcaProduto())&& novoProduto.getNomeProduto().equals(produto.getNomeProduto())){
                produto.setQuantemEstoque(produto.getQuantemEstoque() + quantidadeNovoProduto);
            }
        }

        this.produtoList.add(novoProduto);
        System.out.println("Produto " + novoProduto.getIdProduto() + " adicionado com sucesso!");
    }

    public void listaProdutosImprime(){
        if(produtoList.isEmpty()) {
            System.out.println("Não há registro na lista");
        } else{
            for(Produto produto: produtoList) {
                System.out.println(produto);
            }
        }
    }

    public Long getIdEstoque() {
        return idEstoque;
    }


    public void deletarProduto(Long idProduto){
        for(Produto produto: produtoList) {
            if(produto.getIdProduto().equals(idProduto)) {
                produtoList.remove(produto);
            }
        }
    }
}
