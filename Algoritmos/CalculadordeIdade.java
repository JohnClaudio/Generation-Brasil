package GenerationTurma32.Algoritmos;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.

*/

public class CalculadordeIdade {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade, meses, dias;

        try {
            System.out.println("Digite sua idade");
            idade = leia.nextInt();

            meses = idade * 12;
            dias = meses * 30;
            System.out.println("\n Você tem em média de: " + dias + " dias");
        } catch (InputMismatchException error) {

            System.out.println("digite uma idade válida");
        }
    }
}