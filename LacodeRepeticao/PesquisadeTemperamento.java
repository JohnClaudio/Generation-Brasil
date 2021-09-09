package GenerationTurma32.LacodeRepeticao;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: USE (WHILE)

 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.*/

public class PesquisadeTemperamento {

    public static void main(String[] args)
    {
        int
                idade=1,
                temperamentoPessoa=0,
                sexo=0,

                qtdTotalPessoasCalmas=0,
                qtdOutrosCalmos=0,

                qtdHomensAgressivos=0,
                qtdMulheresNervosas=0,

                qtdPessoasNervosasMais40Anos=0,
                qtdPessoasCalmasMenos18Anos=0;

                Scanner leia = new Scanner(System.in);
                String nome;

        try {

            while (idade>0)
            {
                System.out.println("Digite o nome da pessoa");
                nome = leia.nextLine();

                System.out.println("Digite a idade \n");
                idade = leia.nextInt();
                System.out.println("Digite o sexo (1-feminino / 2-masculino / 3-Outros) \n");
                sexo = leia.nextInt();

                System.out.println("Digite o temperamento da pessoa: \n 1 = calma; \n 2= nervosa  \n 3, agressiva \n" );
                temperamentoPessoa = leia.nextInt();

                if(sexo==1) //SEXO FEMININO
                {

                    if (temperamentoPessoa==1) {  //CALMA
                        qtdTotalPessoasCalmas += +1;
                    }

                    else if(temperamentoPessoa==2) //NERVOSA
                    {

                        if(idade>40)
                        {
                            qtdPessoasNervosasMais40Anos += +1;
                        }else if(idade<18)
                        {
                            qtdPessoasCalmasMenos18Anos += +1;
                        }
                    }

                }

                if(sexo==2) //SEXO MASCULINO
                {

                    if (temperamentoPessoa==1) {  //CALMA
                        qtdTotalPessoasCalmas += +1;
                    }

                    else if(temperamentoPessoa==2) //NERVOSA
                    {
                        qtdMulheresNervosas += +1;

                        if(idade>40)
                        {
                            qtdPessoasNervosasMais40Anos += +1;
                        }else if(idade<18)
                        {
                            qtdPessoasCalmasMenos18Anos += +1;
                        }

                    }
                }

                if(sexo==3) //SEXO OUTROS
                {

                    if (temperamentoPessoa==1) {  //CALMA
                        qtdTotalPessoasCalmas += +1;
                        qtdOutrosCalmos += +1;
                    }

                    else if(temperamentoPessoa==2) //NERVOSA
                    {
                        if(idade>40)
                        {
                            qtdPessoasNervosasMais40Anos += +1;
                        }else if(idade<18)
                        {
                            qtdPessoasCalmasMenos18Anos += +1;
                        }

                    }
                }

            }

            System.out.println("Total de pessoas calmas: " + qtdTotalPessoasCalmas);
            System.out.println("Total de outros calmos: " + qtdOutrosCalmos);

            System.out.println("Total de mulheres nervosas: " + qtdMulheresNervosas);
            System.out.println("Total de homens agressivos: " + qtdHomensAgressivos);

            System.out.println("Total de pessoas nervosas acima de 40 anos: " + qtdPessoasNervosasMais40Anos);
            System.out.println("Total de pessoas calmas com menos de 18 anos: " + qtdPessoasCalmasMenos18Anos);

        }
        catch (InputMismatchException error)
        {
            System.out.println("Você precisa digitar uma idade válido");
        }
    }
}
