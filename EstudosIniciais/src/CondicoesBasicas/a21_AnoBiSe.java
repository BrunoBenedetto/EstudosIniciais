package CondicoesBasicas;

/*21) Faça um algoritmo que leia um determinado ano e mostre se ele é ou não
BISSEXTO. */

import java.util.Locale;
import java.util.Scanner;

public class a21_AnoBiSe {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o ano que deseja verificar:");
        double Ano = sc.nextDouble();

        if (Ano % 4 == 0 && Ano % 100 != 0 || Ano % 400 == 0){
            System.out.println("Ano bissexto");
        }else {
            System.out.println("Não é ano bissexto");
        }
        sc.close();
    }
}
