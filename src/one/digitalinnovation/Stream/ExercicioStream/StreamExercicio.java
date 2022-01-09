package one.digitalinnovation.Stream.ExercicioStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class StreamExercicio {
    public static void main(String[] args) {
        List<Estudante> Estudantes = new ArrayList<>();

        Estudantes.add(new Estudante("Rafael", 31, "m"));
        Estudantes.add(new Estudante("Antonio", 10, "m"));
        Estudantes.add(new Estudante("José", 54, "m"));
        Estudantes.add(new Estudante("Ronaldo", 4, "m"));
        Estudantes.add(new Estudante("Maria", 25, "F"));

        //Exercicio 1 - Transforme cada estudante em uma string com os atributos do objeto
        System.out.println(Estudantes);

        // Exercicio 2 - Conte a quantidade de estudantes tem na coleção
        System.out.println("Contagem" + Estudantes.stream().count());

        // Exercicio 3 - Filtre estudantes com idade igual ou maior 18 anos
        System.out.println("Filtro" + Estudantes.stream()
                .filter(estudante -> estudante.getIdade() > 18)
                .collect(Collectors.toList()));

        // Exercicio 4 - Exiba cada elemento no console
        for (Estudante estudantes:Estudantes) {
            System.out.println(estudantes);
        }

        // Exercicio 5 - Retorne estudantes com o nome que possui a letra B
        System.out.println("Filtro" + Estudantes.stream()
                .filter(estudante -> estudante.getNome().contains("a"))
                .collect(Collectors.toList()));

        // Exercicio 6 - Retorne se existem estudantes com letra D
        System.out.println("Filtro " + Estudantes.stream()
                        .anyMatch(estudante -> estudante.getNome().contains("d")));

        // Exercicio 7 - Retorne o estudante mais velho da coleção e o mais novo.
        System.out.println("Filtro " + Estudantes.stream()
                .min(Comparator.comparing(Estudante::getIdade)));

        System.out.println("Filtro " + Estudantes.stream()
                .max(Comparator.comparing(Estudante::getIdade)));




    }

}
