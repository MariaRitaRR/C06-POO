import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        boolean [][] campoMinado ;
        campoMinado = new boolean[4][4];
        //boolean campoMinado [][] = new boolean[2][2];
        Random rand = new Random();
        int x = rand.nextInt(3);
        int y = rand.nextInt(3);

        int posicaoX,posicaoY;
        campoMinado[x][y] = true;
        Scanner entrada = new Scanner(System.in);
        System.out.println(x);
        System.out.println(y);

       do {


            posicaoX = entrada.nextInt();
            posicaoY = entrada.nextInt();
            if(campoMinado[posicaoX][posicaoY]) {

                System.out.println("Bomba");
            }
            else {
                System.out.println("Livre");
            }

        } while(!campoMinado[posicaoX][posicaoY]);

        entrada.close();
    }
}