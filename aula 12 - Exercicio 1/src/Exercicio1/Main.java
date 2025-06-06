package Exercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Double> listaDouble = new ArrayList<Double>();
        for (int i = 0; i < 5; i++) {
            listaDouble.add(new Random().nextDouble()*100);
        }
        System.out.println("antes da ordenação");

        for (Double d : listaDouble) {
            System.out.println(d);
        }

        System.out.println("depois da ordenação");

        Collections.sort(listaDouble,Collections.reverseOrder());
        for (Double d : listaDouble) {
            System.out.println(d);
        }
    }
}
