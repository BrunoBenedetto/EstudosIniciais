package CodigosBasicos;

/*14) A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado. */


import java.util.Scanner;
import java.util.Locale;

public class a14_LocCarro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double KmPer, Total, Diaria, KmRod;
        int diasAlug;

        System.out.println("Quantos Km foram percorridos?");
        KmPer = sc.nextDouble();

        System.out.println("Informe a quantidade de dias:");
        diasAlug = sc.nextInt();

        Diaria = diasAlug * 90;
        KmRod = KmPer * 0.20;
        Total = Diaria + KmRod;

        System.out.printf("O valor a ser cobrado será: R$%.2f", Total);

        sc.close();
    }
}
