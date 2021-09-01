package GenerationTurma32.Algoritmos.LacodeDecisao;
/*Faça um programa que entre com três números e coloque em ordem crescente.*/

import java.util.Scanner;
public class OrdemCrescente {

    public static void main(String[] args){
        int a,b,c;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite p1,p2,p3 \n");

        a = leia.nextInt();
        b = leia.nextInt();
        c = leia.nextInt();
        System.out.println("\n");

        //5 25 2 ENTRADA DE EXEMPLO USUARIO ENTRA NESTE LAÇO

        if (a<b && a<c) // SE O "A" FOI O MENOR NUMERO DIGITADO
        {
            System.out.println("entrou no laço em que A É O MENOR");
            // SABEMOS QUE O MENOR NUMERO DIGITADO FOI A, PRECISAMOS AGORA SABER A ORDEM DE B E C

            if (b<c)  // SE B FOR MENOR QUE C
            {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            }else if(b>c) //SE B FOR MAIOR QUE C
            {
                System.out.println(a); //5
                System.out.println(c); //2
                System.out.println(b); //25
            }
        }

        //5 25 2 ENTRADA DE EXEMPLO USUARIO

        if (b<a && b<c) // SE O B FOI O MENOR NUMERO DIGITADO ENTRA NESTE LAÇO;
        {

            System.out.println("entrou no laço em que B É O MENOR");
               //COMO SABEMOS QUE O MENOR NUMERO DIGITADO FOI B, PRECISAMOS SABER A ORDEM DE A E C

                if (a < c) { // SE A FOR MENOR QUE C

                    System.out.println(b); //
                    System.out.println(a);
                    System.out.println(c);

                } else if (a > c) { // SE B FOR MENOR QUE C
                    System.out.println(b); //
                    System.out.println(a); //
                    System.out.println(c); //

                }

        }

        //5 25 2 ENTRADA DE EXEMPLO USUARIO ENTRA NESTE LAÇO

        if (c<a && c<b){ // SE O C FOI O MENOR NUMERO DIGITADO;
            System.out.println("entrou no laço em que C É O MENOR");

            if (a<b)
            {
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
            }else if(b>a)
            {
                System.out.println(c); //5
                System.out.println(b); //2
                System.out.println(a); //25
            }
        }


    }
}
