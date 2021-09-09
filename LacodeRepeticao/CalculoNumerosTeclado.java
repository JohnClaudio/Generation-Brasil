package GenerationTurma32.LacodeRepeticao;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
*/
public class CalculoNumerosTeclado {

    public static void main(String[] args)
    {
        int numero,soma=0;
        Scanner leia = new Scanner(System.in);

        try {
            do{
                System.out.println("Digite um numero inteiro");
                numero = leia.nextInt();
                soma += numero;
            }while (numero!=0);

            System.out.println("A soma dos numeros foi de: "+ soma);
        }

        catch (InputMismatchException error)
        {
            System.out.println("Você precisa digitar um numero inteiro válido");
        }
    }

}
