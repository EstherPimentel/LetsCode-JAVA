package Exercicio5Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Generico generico = new Generico();
        Vampiro vampiro = new Vampiro();
        Inimigo cobra = new Cobra();
        Inimigo gigante = new Gigante();

        System.out.println(generico);
        System.out.println(vampiro);
        System.out.println(cobra);
        System.out.println(gigante);

        System.out.println(generico.tipo);
        System.out.println(vampiro.tipo);
        System.out.println(cobra.tipo);
        System.out.println(gigante.tipo);

        generico.atacar(10, Ataque.PERFURANTE);
        generico.apanhar(20, Ataque.PERFURANTE);
        generico.interagir();

        vampiro.atacar(20, Ataque.PERFURANTE);
        vampiro.apanhar(50, Ataque.PERFURANTE);
        vampiro.interagir();

        cobra.atacar(10, Ataque.PERFURANTE);
        cobra.apanhar(40, Ataque.PANCADA);
        cobra.interagir();

        gigante.atacar(25, Ataque.PERFURANTE);
        gigante.apanhar(47, Ataque.FOGO);
        gigante.apanhar(47, Ataque.PANCADA);
        gigante.interagir();
    }
}
