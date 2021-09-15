package GenerationTurma32.Consumer_Predicate_Function;

import java.util.function.Consumer;
import java.util.function.Predicate;


public class ImprimindoMeuTexto {

    public static void main(String args[])
    {
        Consumer<Boolean> Imprimirteste = texto -> System.out.println(texto);
        Consumer<String> imprimirTexto = texto -> System.out.println(texto);


        Predicate<String> verificarCampoVazio = String::isEmpty;
        Predicate<String> teste = validarTexto -> validarTexto=="TEXTO";


        imprimirTexto.accept(("BOOTCAMP SANTANDER"));


        Imprimirteste.accept(verificarCampoVazio.test("")); //RETORNA TRUE
        Imprimirteste.accept(teste.test("#GENERATION")); //RETORNA FALSE

    }
}
