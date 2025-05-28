package org.example;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Path arquivo = Paths.get("professores_diciplina.txt");


        try {
            List<String> conteudo = Files.readAllLines(arquivo);
            Map<String, String> map = new HashMap<>();

            conteudo.forEach(linha ->
            {
                String[] linhaQuebrada = linha.split("=");
                map.put(linhaQuebrada[0].trim(),linhaQuebrada[1].trim());
            });
            System.out.println("Conteudo do arquivo: ");
            map.forEach((key, value) -> System.out.println(key + " -> " + value));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}