public abstract class Pessoa {

    private String nome;
    private int idade;


    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;

    }

    public String getName() {
        return this.nome;
    }

    public void setName(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;

    }



}
