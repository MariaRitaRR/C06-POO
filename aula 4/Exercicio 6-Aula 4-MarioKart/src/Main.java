//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Criando Karts
        //Lembrando que o Motor é criado junto

        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        kart1.nome = "Kart1";
        kart2.nome = "Kart2";

        //Colocando valores para o motor kart 1
        kart1.motor.cilindrada = "150";
        kart1.motor.velocidadeMaxima = 95.20f;

        //Colocando valores para o motor kart 2
        kart2.motor.cilindrada = "50";
        kart2.motor.velocidadeMaxima = 76.10f;

        //Criando dois valores
        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();

        //Atribuindo valores para os pilotos
        piloto1.nome = "Piloto1";
        piloto2.nome = "Piloto2";

        //Executando ações do piloto
        piloto1.soltaSuperPoder();
        piloto2.soltaSuperPoder();

        //Executando ações do Kart1
        kart1.fazerDrift();
        kart1.motor.mostraInfo();

        //Executando ações do Kart2
        kart2.fazerDrift();
        kart2.motor.mostraInfo();
    }
}