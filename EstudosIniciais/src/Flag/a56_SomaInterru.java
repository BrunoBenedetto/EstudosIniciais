package Flag;

/*56) Crie um programa que leia vários números pelo teclado e mostre no final o
somatório entre eles.
Obs: O programa será interrompido quando o número 1111 for digitado*/

import java.util.Locale;
import java.util.Scanner;

public class a56_SomaInterru {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        boolean flag = true;
        int num;
        int soma = 0;

        while (flag) {
            System.out.println("Digite um número: ");
            num = sc.nextInt();

            if (num == 1111) {
                flag = false;

            } else {
                soma += num;

            }
            System.out.printf("O resultado é: %d\n", soma);

        }
        sc.close();
    }
}