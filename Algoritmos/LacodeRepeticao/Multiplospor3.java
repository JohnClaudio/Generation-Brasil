package GenerationTurma32.Algoritmos.LacodeRepeticao;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
*/
public class Multiplospor3 {

    public static void main(String[] args)
    {
        int numero,soma=0;
        Scanner leia = new Scanner(System.in);

        try {

            do{
                System.out.println("Digite um numero inteiro");
                numero = leia.nextInt();

                    if(numero%3==0)
                    {
                        soma += + numero;
                    }

            }while (numero!=0);

            System.out.println("A soma dos numeros foi de: "+ soma);
        }

        catch (InputMismatchException error)
        {
            System.out.println("Você precisa digitar um numero inteiro válido");
        }
    }
}
