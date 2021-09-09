package GenerationTurma32.VetoreseMatrizes;
/*
3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Matriz3x3 {



    public static void main(String[] args) {
        int numero[][] = new int [3][3];
        Scanner leia = new Scanner(System.in);
        int qtdValoresMaioresqueDez=0;
        try
        {

            for (int i=0;i<=2;i++)
            {
                    for (int b=0; b<=2; b++)
                    {
                        System.out.println("Preencha o valor da linha: " + i + " e coluna: " + b );
                        numero[i][b] = leia.nextInt();

                        if(numero[i][b]>10)
                        {
                            qtdValoresMaioresqueDez++;
                        }

                    }
            }
            System.out.println("A matriz possui: " + qtdValoresMaioresqueDez + " valores superiores a 10");

        }
        catch (InputMismatchException error)
        {

            System.out.println("Você precisa digitar um numero inteiro válido");
        }


    }
}
