package CodigosBasicos;

/*13) Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o
seu novo salário, com 15% de aumento. */

import java.util.Locale;
import java.util.Scanner;

public class a13_Sal15Aum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double salario, aumento, novoSalario;

        System.out.println("Informe o salário do funcionário:");
        salario = sc.nextDouble();

        aumento = (salario * 15) / 100;
        novoSalario = salario + aumento;

        System.out.println("Calculando...");
        System.out.printf("Novo salário R$%.2f", novoSalario);

        sc.close();
    }
}
