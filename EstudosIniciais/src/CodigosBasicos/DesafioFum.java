package CodigosBasicos;

/* [DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um
fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
quantos dias de vida um fumante perderá e exiba o total em dias. */

import java.util.Scanner;
import java.util.Locale;

public class DesafioFum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double QntCig, CalcCig, Ano, Dias, Min;

        System.out.println("Quantos cigarros são fumados por dias?");
        QntCig = sc.nextDouble();


        System.out.println("Por quantos anos foi fumante?");
        Ano = sc.nextDouble();

        CalcCig = QntCig * 365 * Ano;
        Min = CalcCig * 10;
        Dias = Min / (60 * 24);

        System.out.printf("\nO total de dias perdidos foram: %.0f", Dias);

        sc.close();
    }
}
