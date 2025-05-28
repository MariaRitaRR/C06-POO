package br.inatel.cdg.mary;

public class Contador1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Contador: " + i +" -- Contador 1 --");
        }
    }
}
