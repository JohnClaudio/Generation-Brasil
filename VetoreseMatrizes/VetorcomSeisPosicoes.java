package GenerationTurma32.VetoreseMatrizes;


/*
1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos:


(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
(d) Mostre na tela cada valor do vetor A, um em cada linha.


 */
public class VetorcomSeisPosicoes {

    public static void main(String[] args) {
        int somaVetor = 0;
        int[] a = {1, 0, 5 ,- 2, -5, 7};
        somaVetor = a[0] + a[1] + a[5];

        a[4] = 100;
        for (int i=0;i<a.length; i++)
        {
            System.out.println("Vetor: a posicao: "+ i + " Valor alocado: " + a[i]);
        }
        System.out.println("\n A soma das posicoes  A[0] + A[1] E A[5] é de: " +  somaVetor);

    }
}