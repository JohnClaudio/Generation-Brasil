package GenerationTurma32.Algoritmos.LacodeRepeticao;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
*/

public class TotaldeIdade {

    public static void main(String[] args)
    {
        int idade=0, idadesMenores21=0, idadesMaiores50=0;
        Scanner leia = new Scanner(System.in);

        try {

            while (idade>=0)
            {
                System.out.println("Digite uma idade");
                idade = leia.nextInt();

                if (idade<20)
                {
                    idadesMenores21 += +1;
                }
                else if(idade>50)
                {
                    idadesMaiores50 += +1;
                }

            }
            System.out.println("Total de pessoas com menos de 21  : " + idadesMenores21 + " \n Total de pessoas com mais de 50: " + idadesMaiores50);
        }
        catch (InputMismatchException error)
        {
            System.out.println("Você precisa digitar uma idade válido");
        }
    }
}
