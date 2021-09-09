package GenerationTurma32.Algoritmos.POO.AnimalPolimorfismo;
/*Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal:*/

abstract class Animal {
    protected String nome;
    protected int idade;
    protected String categoria;

    public void falar(){
        System.out.println(" o animal está emitindo Som");

    }
    public void andar(){
        System.out.println(this.nome + "está andando");

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
