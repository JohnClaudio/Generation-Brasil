package GenerationTurma32.Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Eowyn");
        fila.add("Fruta d'Ouro");
        fila.add("Mandos");

        Consumer<Queue> chamarPrimeiroFila = filas -> System.out.println("A primeira pessoa da fila : " + fila.poll());
        Consumer<String> adicionarPessoaFila = nomePessoa -> { fila.add(nomePessoa); System.out.println("A Pessoa " + nomePessoa + "foi adicionado na fila"); };
        Consumer<Queue> chamarProximoFila = filas -> {  filas.remove(); System.out.println("Proximo da fila" + filas.poll()); };

        chamarPrimeiroFila.accept(fila);
        adicionarPessoaFila.accept("Joao");

        chamarPrimeiroFila.accept(fila);

        System.out.println(fila);




    }

}
