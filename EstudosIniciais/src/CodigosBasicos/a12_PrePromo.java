package CodigosBasicos;

/*12) Crie um programa que leia o preço de um produto, calcule e mostre o seu
PREÇO PROMOCIONAL, com 5% de desconto.*/

import java.util.Locale;
import java.util.Scanner;

public class a12_PrePromo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double valor1, promo, subtotal;

        System.out.println("Insira o valor do produto:");
        valor1 = sc.nextDouble();

        promo =  (valor1 * 5) / 100;
        System.out.printf("Promoção de 5%% de desconto aplicada no valor: R$%.2f", promo);

        subtotal = valor1 - promo;
        System.out.printf("\nNovo valor com desconto: R$%.2f", subtotal);

        sc.close();
    }
}
