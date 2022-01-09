package one.digitalinnovation.map.Exercicio;

import java.util.HashMap;
import java.util.Map;

public class ExercicioMap {
    public static void main(String[] args) {
        Map<String, String> Estados = new HashMap<>();
        //Exercicio 1- Adicione estados
        Estados.put("São Paulo", "SP");
        Estados.put("rio de janeiro", "RJ");
        Estados.put("Amazonas", "AM");
        Estados.put("Fortaleza", "FO");

        //Exercicio 2- Remova estado
        Estados.remove("Amazonas");
        System.out.println(Estados);
        //Exercicio 3- Verifique tamanho do mapa
        Estados.size();
        System.out.println(Estados);
        //Exercicio 4- remover usando o nome e chave
        Estados.remove("São Paulo",1);
        System.out.println(Estados);
        //Exercicio 5- Navegue em todos os registros do map
        for (Map.Entry<String,String>percorre:Estados.entrySet()) {
            System.out.println(percorre.getKey().equals("São Paulo") + " -- " + percorre.getValue());
        }


    }
}
