package GenerationTurma32.Algoritmos;

import java.util.InputMismatchException;
import java.util.Scanner;

/*//PESOS NOTAS
		const inteiro
		peso1=2,
		peso2=3,
		peso3=5

		//VARIAVEIS
		real p1,p2,p3,media, calculoPeso
		escreva("-----> digite as notas p1, p2 <-------")
		leia(p1,p2,p3)
		calculoPeso= (p1*peso1 + p2*peso2 + p3*peso3) / (peso1+peso2+peso3)
		escreva("Média:", calculoPeso)
*/

public class MediacomPeso {

    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        final int peso1=2, peso2=3, peso3=5;

        float p1,p2,p3,media, calculoMedia;

        try
        {
            System.out.println("Digite a nota p1\n");
            p1 = leia.nextFloat();

            System.out.println("Digite a nota p2\n");
            p2 = leia.nextFloat();

            System.out.println("Digite a nota p3\n");
            p3 = leia.nextFloat();

            calculoMedia= (p1*peso1 + p2*peso2 + p3*peso3) / (peso1+peso2+peso3);

            System.out.println("A média do aluno foi de: " + calculoMedia);
        }
        catch (InputMismatchException error)
        {

            System.out.println("digite um valor inteiro em dias");
        }



    }
}
