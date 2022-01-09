package one.digitalinnovation.Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExemploStreamAPI
{
    public static void main (String[] args){
        List<String> estudantes = new ArrayList<>();

        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");



        // Retorna a contagem de elementos do stream
        System.out.println("Contagem" + estudantes.stream().count());

        // Retorna o elemento com maior numero de letras
        System.out.println("Maior numero de letras:" + estudantes.stream().max(Comparator.comparingInt(String::length)));

        // Retorna o elemento com menor numero de letras
        System.out.println("Menor numero de letras:" + estudantes.stream().min(Comparator.comparingInt(String::length)));

        // Retorna os elementos que tem a letra R no nome
        System.out.println("Com a letra r no nome:" + estudantes.stream().filter((estudante) ->
                estudante.toLowerCase().contains("r")).collect(Collectors.toList()));
        

    }
}
