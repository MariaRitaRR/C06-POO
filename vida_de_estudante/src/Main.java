import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float NPA = entrada.nextFloat();

        if (NPA >= 60){

            System.out.println("Aprovado");

        } else  {
            System.out.println("Ficou de NP3");
            System.out.println("entre com a nota da NP3");
            float NP3 = entrada.nextFloat();
        }



        entrada.close();

    }
}