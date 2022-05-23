package Exercicio3Encapsulamento;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque ("livros");
        Produto produto1 = new Produto("livro", "suspense", "série", 5, "editora");
        Produto produto2 = new Produto("livro", "suspense", "série", 5, "editora");

        estoque.adicionarProduto(produto1);
        estoque.adicionarProduto(produto2);

        estoque.listaProdutosImprime();

        System.out.println("Estoque tem o id: " + estoque.getIdEstoque());

        estoque.deletarProduto(produto1.getIdProduto());
        estoque.listaProdutosImprime();
    }
}
