package Aula02;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        //pessoa.falar();

        Pessoa pessoa1 = new Pessoa("Esther", 34, 1.59, 47, SexoEnum.FEMININO, LocalDate.now(), true);
        Pessoa pessoa2 = new Pessoa("Maria", 32, 1.59, 46, SexoEnum.FEMININO, LocalDate.now(), true);
        Pessoa pessoa3 = new Pessoa("Pedro", 36, 1.59, 45, SexoEnum.MASCULINO, LocalDate.now(), true);

        System.out.println("O nome é: " + pessoa1.getNome());
        pessoa1.setNome("Esther Porto");
        System.out.println(pessoa1.getNome());

        Pessoa.quemSou();

        pessoa1.falar();
        pessoa2.comer();
        pessoa3.dormir();

        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
        System.out.println(pessoa3.toString());
    }
}
