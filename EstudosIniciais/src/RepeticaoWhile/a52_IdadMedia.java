package RepeticaoWhile;

/*52) Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final:
a) Qual é a média de idade do grupo
b) Quantas pessoas tem mais de 18 anos
c) Quantas pessoas tem menos de 5 anos
d) Qual foi a maior idade lida */

import java.util.Locale;
import java.util.Scanner;

public class a52_IdadMedia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double media = 0;
        double count = 0;
        int mais18 = 0;
        int menos5 = 0;
        int maiorIdade = 0;

        int i = 0;
        while (i < 10) {
            System.out.println("Digite sua idade");
            int age = sc.nextInt();
            i++;

            if (age > 18) {
                mais18++;
            }
            if (age < 5) {
                menos5++;
            }
            if (age > maiorIdade) {
                maiorIdade = age;
            }

            count += age;
            media = count / i;

        }
        System.out.printf("a) Qual é a média de idade do grupo: %.2f\n", media);
        System.out.printf("b) Quantas pessoas tem mais de 18 anos: %d \n", mais18);
        System.out.printf("c) Quantas pessoas tem menos de 5 anos: %d \n", menos5);
        System.out.printf("d) Qual foi a maior idade lida: %d \n", maiorIdade);

        sc.close();
    }
}