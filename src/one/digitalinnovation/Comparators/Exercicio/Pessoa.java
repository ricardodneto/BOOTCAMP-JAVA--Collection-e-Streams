package one.digitalinnovation.Comparators.Exercicio;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private Integer idade;

    public Pessoa(String nome,Integer idade){
        this.nome=nome;
        this.idade=idade;
    }

    public Integer getIdade(){return  idade;}

    public String getNome(){
        return nome;
    }

    public String toString(){return  nome + "--"+idade;}

    @Override
    public int compareTo(Pessoa o) {
        return this.getIdade() - o.getIdade();
    }
}
