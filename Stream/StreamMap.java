package GenerationTurma32.Stream;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamMap {
    public static void main(String[] args) {

        String[] nomes = {"Joao", "Maria", "Carlos"};

        //Adicionando Pereira como sobrenome com map e forach:
        Stream.of(nomes).map(nome -> nome + " : Pereira").forEach(System.out::println);

      //Function<String,Stream> adicionarPereira = NomeVetor ->  Stream.of(nomes).map(nome -> nome + " pereira").forEach (System.out::println);
        Consumer<String[]> AdicionarSobrenome = NomeVetor ->  Stream.of(nomes).map(nome -> nome + " pereira").forEach(nome -> System.out.println(nome));


        AdicionarSobrenome.accept(nomes);


    }
}
