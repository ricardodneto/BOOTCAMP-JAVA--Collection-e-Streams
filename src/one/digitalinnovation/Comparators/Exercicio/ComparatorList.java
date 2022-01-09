package one.digitalinnovation.Comparators.Exercicio;

import one.digitalinnovation.Comparators.Estudante;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorList {
    public static void main (String[] args){
        List<Pessoa> Lista = new ArrayList<>();
        Lista.add(new Pessoa ("ronaldo",15));
        Lista.add(new Pessoa ("abelha",5));
        Lista.add(new Pessoa ("joao",80));
        Lista.add(new Pessoa ("maria",55));

        System.out.println("------ ordem de inserção ----");
        Lista.sort((first,second)->first.getIdade() - second.getIdade());
        System.out.println(Lista);



    }
}
