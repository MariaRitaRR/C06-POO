import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        // joga tudo pra mais um
        int x = rand.nextInt(10)+1;
        int y;
        do {
            System.out.println("Qual numero foi geradp?");
            y = entrada.nextInt();

        }while (x != y);

        entrada.close();
    }
}