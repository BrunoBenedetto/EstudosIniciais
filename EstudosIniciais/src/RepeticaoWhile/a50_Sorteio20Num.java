package RepeticaoWhile;

/*50) Desenvolva um programa que faça o sorteio de 20 números entre 0 e 10 e
mostre na tela:
a) Quais foram os números sorteados
b) Quantos números estão acima de 5
c) Quantos números são divisíveis por 3 */

import java.util.Random;

public class a50_Sorteio20Num {
    public static void main(String[] args) {

        Random rd = new Random();

        int i = 1;
        int num5 = 0;
        int div3 = 0;

        System.out.println("Números sorteados:");

        while (i <= 20) {
            int num = rd.nextInt(11);
            i++;

            //a)Quais foram os números sorteados
            System.out.print(num + " ");


            //b) Quantos números estão acima de 5
            if (num > 5) {
                num5++;

                //c) Quantos números são divisíveis por 3
            }
            if (num % 3 == 0 && num != 0) {
                div3++;
            }
        }
        System.out.printf("\nNúmeros acima de 5: %d", num5);

        System.out.printf("\nNúmeros divisiveis de 3: %d", div3);
    }
}
