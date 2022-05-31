package ExercicioExtra5Abstract5;

import java.util.ArrayList;

public class Empresa {
    private String nome;
    private String cnpj;
    // private Funcionario funcionario; relação 1 para 1, ou seja, 1 empresa tem 1 funcionário.
    private ArrayList<Funcionario> listaFuncionario = new ArrayList<>(); //relação 1 para muitos, ou seja, 1 empresa tem vários funcionários.


    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public void cadastrar(Funcionario funcionario){ //armazenando valor dentro do ArrayList
        listaFuncionario.add(funcionario); // o funcionário é adicionado na última posição do array
        System.out.println("Funcionário foi cadastrado com sucesso!");
    }

    public void listar(){
        for(int i = 0; i < listaFuncionario.size(); i++){
            System.out.println(listaFuncionario.get(i));

        }
    }

    public void remover(Funcionario funcionario){
       listaFuncionario.remove(funcionario);
        System.out.println("Funcionario " + funcionario.getNome() + " foi removido com sucesso!");
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", listaFuncionario=" + listaFuncionario +
                '}';
    }
}
