package GenerationTurma32.Algoritmos.VetoreseMatrizes;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
2- Faça um programa que receba 6 números inteiros e mostre:
• Os números pares digitados;
• A soma dos números pares digitados;
• Os números ímpares digitados;
• A quantidade de números ímpares digitados.
*/
public class VetorPareseImpares {

    public static void main(String[] args) {
        int numero[]= new int [6];
        int somapares=0,qtdImpares=0;
        Scanner leia = new Scanner(System.in);

        try
        {
            for(int i=0; i<numero.length; i++)
            {
                System.out.println("O preencha com um valor inteiro o indice " + i);
                numero[i] = leia.nextInt();

            }

            for(int b=0;b<numero.length;b++)
            {
                    if (numero[b]%2==0)
                    {
                        somapares += numero[b];
                        System.out.println("O numero " + numero[b] + " do indice: " + b + " é PAR");
                    }
                    else
                    {
                        qtdImpares += +1;
                        System.out.println("O numero " + numero[b] + " do indice: " + b + " é IMPAR");
                    }

            }
            System.out.println("\nO Total de numero par digitados foi de: " + qtdImpares);
            System.out.println("\nA soma total dos numeros pares é de: " + somapares);

        }
        catch (InputMismatchException error)
        {

            System.out.println("Você precisa digitar um numero inteiro válido");
        }


    }
}
