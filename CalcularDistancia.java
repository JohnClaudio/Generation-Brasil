package GenerationTurma32;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
	Construa um programa em c que, tendo como dados de entrada dois pontos
	quaisquer no plano, P(x1, y1) e P(x2, y2),
	escreva a distância entre eles. A fórmula
	*/
public class CalcularDistancia {

    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        double x1,x2,y1,y2,distancia;
        try
        {
            System.out.println("Digite a codernada x1 do primero ponto \n");
            x1 = leia.nextFloat();

            System.out.println("Digite a codernada  y1 do primero ponto \n");
            y1 = leia.nextFloat();

            System.out.println("Digite a codernada x2 do segundo ponto \n");
            x2 = leia.nextFloat();

            System.out.println("Digite a codernada  y2 do segundo ponto \n");
            y2 = leia.nextFloat();

            distancia = Math.sqrt( Math.pow( (x2-x1),2 ) + Math.pow( (y2-y2),2 ));

            System.out.println("\n A distância entre os dois pontos é de: " + distancia);
        }
        catch (InputMismatchException error)
        {

            System.out.println("digite um valor válido");
        }


    }
}
