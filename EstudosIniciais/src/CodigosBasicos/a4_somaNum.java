package CodigosBasicos;

/*4) Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
entre eles.
Ex:
Digite um valor: 8
Digite outro valor: 5
A soma entre 8 e 5 é igual a 13.*/

import java.util.Scanner;

public class a4_somaNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2, result;

        System.out.println("Informe o primeiro número: ");
        num1 = sc.nextInt();
        System.out.println("Informe o segundo número: ");
        num2 = sc.nextInt();

        result = num1 + num2;

        System.out.printf("A soma entre %s e %d é igual a %d", num1, num2, result);

    }
}
