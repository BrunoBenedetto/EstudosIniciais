package CodigosBasicos;

/* 16)Escreva um programa que ajude a calcular o custo de uma viagem de carro em gasolina.
O programa deve pedir ao usuário:
A distância total da viagem em quilômetros (km) a ser percorrida.
O preço atual do litro da gasolina em reais (R$).
O consumo médio do carro em quilômetros por litro (km/L), ou seja, quantos km o carro percorre com 1 litro de gasolina.

Ao final, o programa deve exibir na tela:
A quantidade de litros de gasolina que será utilizada na viagem.
O custo total da viagem em gasolina, em reais.*/

import java.util.Scanner;
import java.util.Locale;

public class a16_CarroKm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double KmPer, KmLit, valorGas, LitrAbst, Total;

        System.out.println("Insira quantos Km a viagem terá?");
        KmPer = sc.nextDouble();

        System.out.println("Quantos Km por litro o carro faz?");
        KmLit = sc.nextDouble();

        System.out.println("Informe o valor atual da gasolina (R$/L):");
        valorGas = sc.nextDouble();

        LitrAbst = KmPer / KmLit;
        Total = LitrAbst * valorGas;

        System.out.printf("Litros de gasolina necessários: %.2f L%n", LitrAbst);
        System.out.printf("Custo total da viagem: R$ %.2f%n", Total);

        sc.close();
    }
}