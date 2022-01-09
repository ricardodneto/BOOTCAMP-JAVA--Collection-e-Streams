package one.digitalinnovation.Comparators;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExampleList {
    public static void main (String[] args){
        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro",19));
        estudantes.add(new Estudante("Carlos",23));
        estudantes.add(new Estudante("Mariana",21));
        estudantes.add(new Estudante("João",18));
        estudantes.add(new Estudante("Thiago",20));

        System.out.println("------ ordem de inserção ----");

        System.out.println(estudantes);

        estudantes.sort((first,second) -> first.getIdade() - second.getIdade());

        System.out.println("------ ordem natural dos números-idade ---");

        System.out.println(estudantes);

        estudantes.sort((first,second) -> second.getIdade() - first.getIdade());

        System.out.println("------ ordem reversa dos números-idade ---");

        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));

        System.out.println("-- ordem natural dos numeros - idade (method reference) --- ");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println(estudantes);






    }

}
