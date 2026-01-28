package CodigosBasicos;

/*9) Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45. */

import java.util.Locale;
import java.util.Scanner;

public class a9_ConvDolar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double real, dolar;

        System.out.println("Informe quantos reais você tem?: ");
        real = sc.nextDouble();

        dolar = real / 3.45;

        System.out.printf("Valor em real R$%.2f e pode comprar US$%.2f dólares", real, dolar);

        sc.close();
    }
}
