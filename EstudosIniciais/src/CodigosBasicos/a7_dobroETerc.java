package CodigosBasicos;

/*7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
sua terça parte.
Ex:
Digite um número: 3.5
O dobro de 3.5 é 7.0
A terça parte de 3.5 é 1.16666*/

import java.util.Scanner;
import java.util.Locale;

public class a7_dobroETerc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double num1, dobro, terc;

        System.out.println("Digite um número:");
        num1 = sc.nextDouble();

        dobro = num1 * 2;
        terc = num1 / 3;

        System.out.printf("O dobro de %s é %s\n", num1, dobro);
        System.out.printf("A terça parte de %s é %.5f\n", num1, terc);

        sc.close();
    }
}
