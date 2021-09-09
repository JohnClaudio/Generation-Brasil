package GenerationTurma32.LacodeDecisao;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto
*/

public class CategoriaIdade {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade;
        try
        {
            System.out.println("Digite uma idade");
            idade = leia.nextInt();

            if(idade>=10 && idade<=14)
            {
                System.out.println("Infantil");
            }
            else if(idade>=15 && idade<=17)
            {
                System.out.println("juvenil");
            }
            else if(idade>=18 && idade<=25)
            {
                System.out.println("adulto");
            }

        } catch (InputMismatchException error) {

            System.out.println("Você precisa digitar um numero inteiro válido");
        }
    }
}
