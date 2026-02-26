package RepeticaoWhile;

/*48) Faça um programa que leia 7 números inteiros e no final mostre o somatório
entre eles. */

import java.util.Scanner;

public class a48_Soma7numInt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = 1;
        int soma = 0;
        int num;

        while (i <= 7){
            System.out.println("Digite um número:");
            num = sc.nextInt();
            soma = soma + num;
            i++;
        }
        System.out.printf("O resultado da soma é: %d", soma);

        sc.close();
    }
}