package CondicoesBasicas;

/*20) Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
ÍMPAR. */

import java.util.Locale;
import java.util.Scanner;

public class a20_ParImpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int num1;

        System.out.println("Digite o número:");
        num1 = sc.nextInt();;

        if(num1 % 2 == 0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }

        sc.close();
    }
}
