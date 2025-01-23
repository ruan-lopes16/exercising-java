package construtores.pessoa;

public class Pessoa {
    // atributos
    private String nome;
    private String cpf;

    // construtores
    public Pessoa(){
        System.out.println("Pessoa criada! Porém, não sei o nome e nem cpf dela, utilize getter e setter");
        // default
    }

    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        System.out.println("Pessoa criada! E já sei o nome e cpf dela");
    }

    // getters
    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    // setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(String cpf){
        this.cpf = cpf;
    }
}
