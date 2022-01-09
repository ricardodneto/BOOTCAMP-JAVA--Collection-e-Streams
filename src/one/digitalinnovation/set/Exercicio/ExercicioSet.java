package one.digitalinnovation.set.Exercicio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExercicioSet {
    public static void main(String[] args) {
        Set<Integer> Inteiros = new HashSet<>();
        //Exercicio 1 - Adicionando No Set
        Inteiros.add(1);
        Inteiros.add(10);
        Inteiros.add(5);
        Inteiros.add(6);
        Inteiros.add(8);
        Inteiros.add(7);

        //Exercicio 2 - Navegue no Set e demonstre todos os itens
        for (Integer inteiros : Inteiros) {
            System.out.println(inteiros);
        }
        //Exercicio 3 -Remover primeiro item do SET
        List<Integer> ListaInteiro = new ArrayList<>(Inteiros);
        ListaInteiro.remove(0);
        Inteiros.clear();

        for (Integer teste:ListaInteiro) {
            Inteiros.add(teste);
        }
        System.out.println(Inteiros);

        //Exercicio 4 - Adicione o novo número no Set:23

        Inteiros.add(23);
        System.out.println(Inteiros);

        // Exercicio 5 - Verifique o tamanho do Set
         Inteiros.size();
         System.out.println(Inteiros);

        // Exercicio 6 - Verifique se o Set está vazio
        Inteiros.isEmpty();



    }

}
