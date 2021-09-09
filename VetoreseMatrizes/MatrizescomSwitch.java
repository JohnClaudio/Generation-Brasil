package GenerationTurma32.VetoreseMatrizes;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes
(2) subtrair a primeira matriz da segunda
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes

Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.
*/
public class MatrizescomSwitch {

    public static void main(String[] args) {
        double matriz_a[][] = new double [2][2];
        double matriz_b[][] = new double [2][2];
        double matriz_calculos[][] = new double [2][2];
        int op;

        Scanner leia = new Scanner(System.in);

        try
        {

                for(int i=0;i <2;i++)
                {
                    for(int b =0; b <2;b++)
                    {
                        System.out.println("\nInsira um valor na matriz_a na linha " + i + " e coluna " +b);
                        matriz_a[i][b] = leia.nextDouble();
                    }
                }

                for(int i=0;i <2;i++)
                {
                    for(int b =0; b <2;b++)
                    {
                        System.out.println("\nInsira um valor na matriz_b na linha " + i + " e coluna " +b);
                        matriz_b[i][b] = leia.nextDouble();
                    }
                }




                    do {
                        System.out.println("digite (1) somar as duas matrizes ");
                        System.out.println("digite (2) subtrair a primeira matriz da segunda  ");
                        System.out.println("digite (3) adicionar uma constante as duas matrizes");
                        System.out.println("digite (4) imprimir as matrizes ");
                        System.out.println("digite (5) para sair do software\n");
                        op = leia.nextInt();
                         switch (op) {

                            case 1:
                                for (int i = 0; i < 2; i++) {

                                    for (int b = 0; b < 2; b++)
                                    {
                                        matriz_calculos[i][b] = matriz_a[i][b] + matriz_b[i][b];
                                        System.out.println("Novo valor da matriz_3 linha " + i + " coluna " + b + " VALOR: " + matriz_calculos[i][b]);
                                    }

                                }

                                System.out.println("Operação de soma realizada com sucesso");
                                break;

                            case 2:

                                for (int i = 0; i < 2; i++) {
                                    for (int b = 0; b < 2; b++) {
                                        matriz_calculos[i][b] = matriz_a[i][b] - matriz_b[i][b];
                                        System.out.println("Novo valor da matriz_3 linha " + i + " coluna " + b + " VALOR: " + matriz_calculos[i][b]);
                                    }
                                }
                                System.out.println("Operação subtração realizada com sucesso");
                                break;

                            case 3:

                                for (int i = 0; i < 2; i++) {
                                    for (int b = 0; b < 2; b++) {
                                        double numero;

                                        System.out.println("\nInsira um valor para a constante");
                                        numero = leia.nextDouble();

                                        matriz_a[i][b] += numero;
                                        matriz_b[i][b] += numero;
                                    }
                                }
                                System.out.println("Constantes adicionadas nas matrizes A E B");
                                break;

                            case 4:

                                for (int i = 0; i < 2; i++) {
                                    for (int b = 0; b < 2; b++) {

                                        System.out.println("matriz 'A' linha " + i + " coluna " + b + " VALOR: " + matriz_a[i][b]);
                                        System.out.println("matriz 'B' linha " + i + " coluna " + b + " VALOR: " + matriz_b[i][b]);

                                    }
                                }
                                break;
                             default:
                                 System.out.println("\nOps, parece que esta opção nao é válida");

                        }

                    }while(op!=5);




        }
        catch (InputMismatchException error)
        {

            System.out.println("Por favor insira apenas números");
        }


    }
}
