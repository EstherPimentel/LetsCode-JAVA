package ExercicioExtra3Heranca3;

public class Main {
    public static void main(String[] args) {
        Nave nave1 = new Nave(3, 4, 'S', 100, 100);
        Asteroide ast1 = new Asteroide(3, 4, 'S', 99);

        System.out.println(nave1);
        System.out.println(ast1);

        System.out.println(nave1.restaVida(10));
        nave1.girar('N');
        nave1.irA(6,8,'L');
        ast1.toString();
    }
}
