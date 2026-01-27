package CodigosBasicos;

/*6) Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
sucessor.
Ex:
Digite um número: 9
O antecessor de 9 é 8
O sucessor de 9 é 10 */

import java.util.Locale;
import java.util.Scanner;

public class a6_numAntESuc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int num1, ant, suc;

        System.out.println("Digite um número:");
        num1 = sc.nextInt();

        ant = num1 - 1;
        suc = num1 + 1;

        System.out.printf("O antecessor de %s é %s\n", num1, ant);
        System.out.printf("O sucessor de %s é %s\n", num1, suc);

<<<<<<< HEAD
        sc.close();
=======
>>>>>>> 36324949e8acc430275afef742b047eea1437f07
    }
}
