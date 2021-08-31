package GenerationTurma32.Algoritmos;
/*
O custo ao consumidor de um carro novo é a
soma do custo de fábrica com a percentagem do distribuidor e dos impostos
(aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustoConsumidor {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        final int
                PORCENTAGEM_DISTRIBUIDOR = 28,
                PORCENTAGEM_IMPOSTO = 45;

        float custo_fabrica,
                custo_DistribuidorcomImposto,
                custo_finalConsumidor;

        try
        {
            System.out.println("Digite o custo de fábrica do veículo");
            custo_fabrica = leia.nextFloat();

            custo_DistribuidorcomImposto = (custo_fabrica * PORCENTAGEM_IMPOSTO / 100) + custo_fabrica;
            custo_finalConsumidor = (custo_DistribuidorcomImposto * PORCENTAGEM_DISTRIBUIDOR / 100) + custo_DistribuidorcomImposto;

            System.out.println("O custo do veículo ao consumidor é de: " + custo_finalConsumidor);

        } catch (InputMismatchException error) {

            System.out.println("digite um numéro válido");
        }

    }
}
