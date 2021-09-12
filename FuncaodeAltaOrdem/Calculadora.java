package GenerationTurma32.FuncaodeAltaOrdem;

public class Calculadora {

    public static void main(String args[])
    {
     Calculo somar = (Double a, Double b)-> a+b;
     Calculo dividir = (Double a, Double b)-> a/b;
     Calculo multiplicar = (Double a, Double b)-> a*b;
     Calculo subtrair = (Double a, Double b)-> a-b;

     System.out.println(realizarCalculo(somar, 1.5 , 1.2));
     System.out.println(realizarCalculo(dividir, 5.0, 5.0));
     System.out.println(realizarCalculo(multiplicar, 9.0, 5.0));
     System.out.println(realizarCalculo(subtrair, 2.0, 5.0));

    }

    public static Double realizarCalculo (Calculo teste, Double a, Double b){ return teste.calcular(a,b); }


    @FunctionalInterface
    public interface Calculo {
        public Double calcular (Double a, Double b);
     
    }



}




