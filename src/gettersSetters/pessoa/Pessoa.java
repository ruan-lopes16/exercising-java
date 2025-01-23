package gpt.OO.gettersSetters.pessoa;

public class Pessoa {
    // atributos
    private String nome;
    private int idade;
    private String cpf;

    // getters
    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public String getCpf(){
        return this.cpf;
    }

    // setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
}
