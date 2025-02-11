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
            System.out.println("Qual numero foi gerado?");
            y = entrada.nextInt();
            if(x == y){
                System.out.println("Voce acertou!");
            } else if (x > y) {
                System.out.println("O numero digitado e menor  do que o gerado");
            }else{
                System.out.println("O numero digitado e maior do que o gerado");
            }
        }while (x != y);

        entrada.close();
    }
}