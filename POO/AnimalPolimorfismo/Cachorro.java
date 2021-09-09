package GenerationTurma32.POO.AnimalPolimorfismo;

public class Cachorro extends Animal{


    public Cachorro(String nome, int idade){
    setIdade(idade);
    setNome(nome);
    }
    public void falar() {

        System.out.println("O Cachorro está latindo: Au Au Au Au");
    }

    public void mover() {

        System.out.println("O Cachorro " + this.nome + " está correndo !");
    }

}
