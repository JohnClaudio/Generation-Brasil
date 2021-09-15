package GenerationTurma32.Stream;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamForeach {
    public static void main(String[] args) {

        String[] nomes = {"Joao","Maria","Carlos"};

        Function<String,String> filtrarVetor = nomeFiltro -> Stream.of(nomes).filter(nome -> nome == (nomeFiltro) ) .collect(Collectors.joining());



        Stream.of(nomes).forEach(nome -> System.out.println(nome));


        Stream.of(nomes).filter(nome-> nome.equals("maria")).collect(Collectors.joining()).length();


        System.out.println(filtrarVetor.apply("Carlos"));


    }


}
