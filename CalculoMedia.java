package GenerationTurma32;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {


        float nota1, nota2, nota3, media;
        Scanner leia = new Scanner(System.in);

        try {
            System.out.println("\n Entre com a primeira nota");
            nota1 = leia.nextFloat();

            System.out.println("\n Entre com a primeira nota2");
            nota2 = leia.nextFloat();

            System.out.println("\n Entre com a primeira nota3");
            nota3 = leia.nextFloat();

            media = (nota1 + nota2 + nota3) / 3;
            System.out.println(media);


        } catch (InputMismatchException error)
        {
            System.out.println("\n Digite um número válido");
        }

    }

}
