package CodigosBasicos;

/*15) Crie um programa que leia o número de dias trabalhados em um mês e mostre o
salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
por hora trabalhada. */

import java.util.Locale;
import java.util.Scanner;

public class a15_HorTrab {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double diaria, total;
        int diasTrab;
        diaria = 25 * 8;

        System.out.println("Quantos dia foram trabalhados?");
        diasTrab = sc.nextInt();

        total = diasTrab * diaria;

        System.out.printf("Seu salário foi de R$%.2f", total);

        sc.close();
    }
}
