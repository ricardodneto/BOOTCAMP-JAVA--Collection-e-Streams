package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExampleArrayList {

    public static void main (String [] args){
        List<String> nomes = new ArrayList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Antonio");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        nomes.set(0,"Larissa");

        Collections.sort(nomes);

        System.out.println(nomes);

        nomes.remove(4);

        System.out.println(nomes);

        String nome = nomes.get(1);

        System.out.println(nomes);

        nomes.remove("Larissa");

        int tamanho = nomes.size();

        System.out.println(tamanho);
        System.out.println(nomes);

        for( String nomeDoItem : nomes){
            System.out.println("----->" + nomeDoItem);

        }

        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()){
            System.out.println("-------->"+iterator.next());
        }


        boolean temAnderson = nomes.contains("João");

        System.out.println(temAnderson);
        nomes.clear();

        boolean listaEStaVAzia = nomes.isEmpty();




    }
}
