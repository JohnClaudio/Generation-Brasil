package GenerationTurma32.Algoritmos.POO.AnimalPolimorfismo;

public class Cavalo extends Animal{

    public Cavalo(String nome, int idade){
        setIdade(idade);
        setNome(nome);
    }
    public void falar()
    {
        System.out.println("O Cachorro está relinchando: iiirrrrí, rilinchin");
    }

    public void mover()
    {
        System.out.println("O Cachorro " + this.nome + " está correndo !");
    }


}
