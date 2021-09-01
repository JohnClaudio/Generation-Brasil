package GenerationTurma32.Algoritmos.LacodeDecisao;
/*
Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
*/


import java.util.InputMismatchException;
import java.util.Scanner;

public class ImpaouPar {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double numero;

        try
        {
            System.out.println("Digite um numero");
            numero = leia.nextDouble();

            if (numero % 2 == 0) {
                System.out.println("O numero: " + numero + " é par, e sua raiz é de: " + Math.sqrt(numero));
            } else {
                System.out.println("O numero: " + numero + " é impar, e seu numero elevado ao quadrado é de: " + Math.pow(numero, 2));
            }

        }
        catch (InputMismatchException error)
        {
            System.out.println("Você precisa digitar um numero inteiro válido");
        }
    }
}
