package Exercicio3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int numValores = 1000;
        long tempoInicial, tempoFinal;

        List<Integer> listaInteger = new ArrayList<Integer>();
        HashSet<Integer> integerHash = new HashSet<Integer>();
        HashMap<Integer,Double> integerDoubleHashMap = new HashMap<>();

        tempoInicial = System.currentTimeMillis();
        for(int i = 0; i < numValores; i++){
            listaInteger.add(new Random().nextInt(1000));
        }
        tempoFinal = System.currentTimeMillis();

        System.out.println("Tempo de adicionar os valores em List: " + (tempoFinal-tempoInicial));

        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < numValores; i++){
            integerHash.add(new Random().nextInt(1000));
        }
        tempoFinal = System.currentTimeMillis();

        System.out.println("Tempo de adicionarcos valores em HashSet: " + (tempoFinal-tempoInicial));

        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < numValores; i++){
            integerDoubleHashMap.put(listaInteger.get(i), new Random().nextDouble());
        }
        tempoFinal = System.currentTimeMillis();

        System.out.println("Tempo de adicionarcos valores em HashMap: " + (tempoFinal-tempoInicial));

        for (int i = 0; i < numValores; i++){
            int value = listaInteger.get(i);
        }

        for(Integer integer : integerHash){
            int val= integer;
        }

        for(Integer integer : integerDoubleHashMap.keySet()){

        }
    }
}
