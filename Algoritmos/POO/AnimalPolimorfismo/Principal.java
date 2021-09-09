package GenerationTurma32.Algoritmos.POO.AnimalPolimorfismo;

public class Principal {

    public static void main (String args[]){

        Cachorro cachorrinho = new Cachorro("Bernaber",5);
        Preguica preguicinha = new Preguica("Luffy",3);
        Cavalo cavalinho = new Cavalo("Zoro",6);

        cachorrinho.falar();
        cachorrinho.mover();

        preguicinha.falar();
        preguicinha.mover();

        cavalinho.falar();
        cavalinho.mover();


        System.out.println("\nO cavalo " + cavalinho.getNome() + " possui: "+ cavalinho.getIdade() + " anos de idade");
        System.out.println("\nA preguica " + preguicinha.getNome() + " possui: "+ cavalinho.getIdade() + " anos de idade");
        System.out.println("\nO cachorro " + cachorrinho.getNome() + " possui: "+ cachorrinho.getIdade() + " anos de idade");



    }
}
