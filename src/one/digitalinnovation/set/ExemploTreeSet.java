package one.digitalinnovation.set;

import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main (String [] args) {
        TreeSet<String> treeCapitais = new TreeSet<>();

        //Monta a árvore com as capitais
        treeCapitais.add("São Paulo");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.print(treeCapitais);

        //Retorna a primeira capital no topo da árvore
        System.out.print(treeCapitais.first());

        //Retorna a última capital no final da árvore
        System.out.print(treeCapitais.last());

        //Retorna a primeira capital abaixo na árvore da capital
        System.out.print(treeCapitais.lower("Florianópolis"));

        //Retorna a primeira capital acima na árvore da capital
        System.out.print(treeCapitais.lower("Florianópolis"));

        //Exibe todas as capitais no console
        System.out.print(treeCapitais);

        //Exibe a primeira capital no topo da árvore, removendo do set
        System.out.print(treeCapitais.pollFirst());

        //Exibe a primeira capital no final da árvore, removendo do set
        System.out.print(treeCapitais.pollLast());



    }
}
