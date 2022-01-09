package one.digitalinnovation.Stream.ExercicioStream;

public class Estudante implements Comparable<Estudante>  {
    private String nome;
    private Integer idade;
    private String sexo;


    public Estudante(String nome, Integer idade,String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo =sexo;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public String toString(){return nome + "---"+idade+"---"+sexo;}


    @Override
    public int compareTo(Estudante o) {
        return this.getIdade() - o.getIdade();
    }
}
