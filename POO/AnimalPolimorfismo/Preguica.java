package GenerationTurma32.POO.AnimalPolimorfismo;

public class Preguica extends Animal {

    public Preguica (String nome, int idade){
        setIdade(idade);
        setNome(nome);
    }
    public void falar() {

        System.out.println("A preguiça " + this.nome + " está falando: .......");
    }

    public void mover() {

        System.out.println("A preguiça " + this.nome + " está subindo lentamento pela árvore");
    }
}
