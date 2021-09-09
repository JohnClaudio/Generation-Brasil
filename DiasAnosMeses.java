package GenerationTurma32;

import java.util.InputMismatchException;
import java.util.Scanner;

/*	Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.
		*/
public class DiasAnosMeses {

    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        int dias,meses,anos;

        try
        {
            System.out.println("Digite a quantidade de dias");
            dias = leia.nextInt();

            meses = dias/30;
            anos = meses/12;

            System.out.println("Meses : " + meses +  " Anos: " + anos);
        }
        catch (InputMismatchException error)
        {

            System.out.println("digite um valor inteiro em dias");
        }


    }
}
