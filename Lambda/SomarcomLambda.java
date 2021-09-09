package GenerationTurma32.Lambda;

import java.util.function.IntBinaryOperator;

public class SomarcomLambda {

    public static void main(String[] args){


        Calculos Calculos = (valor1,valor2) -> {
            return valor1+valor2;
        };
        System.out.println(Calculos.somar(5,5));

    }
}

interface Calculos{

     float somar(float valor1, float valor2) ;


}