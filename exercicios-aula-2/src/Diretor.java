public class Diretor {

    private String nome;
    private int idade;
    private Genero genero;
    private int numeroFilme;


    public Diretor(String nome, int idade, Genero genero, int numeroFilme) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.numeroFilme = numeroFilme;
    }

    public String getNome() {
        return nome;
    }


    public String informacoes(){
        System.out.println(this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Genero: " + this.genero.getDescricao());
        System.out.println("Numero de filmes dirigidos: " + this.numeroFilme);
        return null;
    }
}

