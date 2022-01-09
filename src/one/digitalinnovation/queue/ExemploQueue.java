package one.digitalinnovation.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ExemploQueue {

    public static void main (String [] args) {
        Queue<String> filadeBanco = new LinkedList<>();

        filadeBanco.add("Roberto");
        filadeBanco.add("Patricia");
        filadeBanco.add("Flávio");
        filadeBanco.add("Pamela");
        filadeBanco.add("Anderson");

        System.out.println(filadeBanco);

        String clienteaSeratendido  = filadeBanco.poll();

        System.out.println(clienteaSeratendido);

        System.out.println(filadeBanco);

        /**filadeBanco.clear();*/

        String primeiroCliente = filadeBanco.peek();

        System.out.println(primeiroCliente);

        System.out.println(filadeBanco);



        String primeiroClienteOuErro = filadeBanco.element();

        System.out.println(primeiroClienteOuErro);
        System.out.println(filadeBanco);
        /** For each para navegar na lista
         * Primeiro inserir a variavel e depois a lista;
         */

        for (String client:filadeBanco){
            System.out.println(client);
        }

        Iterator<String> iteratorFilabanco = filadeBanco.iterator();

        while(iteratorFilabanco.hasNext()){
            System.out.println("-------> ITERATOR: "+iteratorFilabanco.next());
        }
        System.out.println(filadeBanco.size());

        System.out.println(filadeBanco.isEmpty());
    }
}


