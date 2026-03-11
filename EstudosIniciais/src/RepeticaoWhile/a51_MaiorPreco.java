package RepeticaoWhile;

/*51) Faça um aplicativo que leia o preço de 8 produtos. No final, mostre na tela
qual foi o maior e qual foi o menor preço digitados. */

import java.util.Scanner;

public class a51_MaiorPreco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valor;
        double maiorVlr = 0;
        double menorVlr = 9999999;
        int i = 1;

        while (i <= 8) {

            System.out.printf("\nDigite o preço do produto %d :", i);
            valor = sc.nextDouble();

            if (valor > maiorVlr) {
                maiorVlr = valor;
            }
            if (valor < menorVlr) {
                menorVlr = valor;
            }

            i++;

        }
        System.out.printf("\nMaior preço: %s", maiorVlr);
        System.out.printf("\nMenor preço: %s", menorVlr);

        sc.close();
    }
}
