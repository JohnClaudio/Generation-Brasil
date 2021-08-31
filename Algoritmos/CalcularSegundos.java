package GenerationTurma32.Algoritmos;
import java.util.InputMismatchException;
import java.util.Scanner;

//	Faça  um  algoritmo  que  leia  o  tempo  de  duração  de  um  evento
//	em  uma  fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos

public class CalcularSegundos {
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        double minutos,horas,segundos;

        try
        {
            System.out.println("Digite a duração do evento em segundos");
            segundos = leia.nextFloat();

            minutos = segundos / 60;
            horas = Math.round(minutos / 60);

            System.out.println("\n O evento durou: " + minutos + " Minutos");
            System.out.println("\nO evento durou: " + horas + " horas");
        }
        catch (InputMismatchException error)
        {

            System.out.println("digite um valor válido");
        }


    }
}
