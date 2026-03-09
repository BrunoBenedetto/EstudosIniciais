package RepeticaoWhile;

/*49) Crie um programa que leia 6 números inteiros e no final mostre quantos deles
são pares e quantos são ímpares. */

import java.util.Scanner;

public class a49_6numParImpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = 1;
        int par = 0;
        int impar = 0;

        while (i <= 6) {

            System.out.println("Informe o número:");
            int num = sc.nextInt();

            i++;

            if (num % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.printf("%d números são pares", par);
        System.out.printf("\n%d números são impares", impar);

        sc.close();

    }
}
