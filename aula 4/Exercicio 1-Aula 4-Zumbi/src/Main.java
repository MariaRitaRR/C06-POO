//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Zumbi z1 = new Zumbi();
        z1.nome = "Robson";
        z1.vida = 100;
        z1.dano = 100;

        Zumbi z2 = new Zumbi();
        z2.nome = "Jose";
        z2.vida = 200;
        z2.dano = 50;

        z1.causarDano(z2, 20);

        System.out.println(z2.vida);

    }
}