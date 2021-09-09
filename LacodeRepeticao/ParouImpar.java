package GenerationTurma32.LacodeRepeticao;

import java.util.InputMismatchException;
import java.util.Scanner;
/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
public class ParouImpar
{
    public static void main(String[] args)
    {
        int numero, totalImpares=0, totalPares=0;
        Scanner leia = new Scanner(System.in);

        try {

            for (int i = 0; i <= 10; i++)
            {
                System.out.println("Digite um numero");
                numero = leia.nextInt();

                if (numero % 2 == 0)
                {
                    totalPares += +1;
                    System.out.println(numero);
                }
                else
                {
                    totalImpares += +1;
                }

            }
            System.out.println("Total de pares: " + totalPares + " , Total de impares: " + totalImpares);
        }
        catch (InputMismatchException error)
        {
            System.out.println("Você precisa digitar um numero inteiro válido");
        }
    }
}
