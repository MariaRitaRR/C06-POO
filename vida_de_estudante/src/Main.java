import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com a NPA");
        float NPA = entrada.nextFloat();

        if (NPA >= 60){

            System.out.println("Aprovado");

        } else  {
            System.out.println("Ficou de NP3");
            System.out.println("Entre com a nota da NP3");
            float NP3 = entrada.nextFloat();
            float NFA = ((NP3 + NPA)/2);
            if (NFA >= 50){
                System.out.println("Aprovado");
            }else {
                System.out.println("Reprovado");
            }
            System.out.println("Nota final: " + NFA);
        }

        entrada.close();

    }
}