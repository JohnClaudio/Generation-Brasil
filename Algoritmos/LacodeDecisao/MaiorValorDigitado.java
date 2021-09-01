package GenerationTurma32.Algoritmos.LacodeDecisao;

import java.util.InputMismatchException;
import java.util.Scanner;

/*1- Faça um programa que receba três inteiros e diga qual deles é o maior.*/
public class MaiorValorDigitado {


    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int maiorValorDigitado=0;
        int[] valores = new int[3];

        try {

            for (int i=0;i<=2;i++)
            {
                System.out.println("Digite três valores inteiros");
                valores[i] = leia.nextInt();

                    if (valores[i]>maiorValorDigitado)
                    {
                        maiorValorDigitado = valores[i];
                    }
            }

            System.out.println("\n O maior valor digitado foi: " + maiorValorDigitado);

        } catch (InputMismatchException error) {

            System.out.println("Você precisa digitar um numero inteiro válido");
        }
    }
}

