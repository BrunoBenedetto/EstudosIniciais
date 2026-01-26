package CodigosBasicos;

/*11) Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
segundo grau e mostre o valor de Delta. */

import java.util.Scanner;
import java.util.Locale;

public class a11_EqPriGrau {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double a, b, c, delta;

        System.out.println("Insira o valor de A");
        a = sc.nextDouble();
        System.out.println("Insira o valor de B");
        b = sc.nextDouble();
        System.out.println("Insira o valor de C");
        c = sc.nextDouble();

        delta = (b * b) - (4 * a * c);

        System.out.printf("O valor de delta é: %s", delta);

        sc.close();
    }
}
