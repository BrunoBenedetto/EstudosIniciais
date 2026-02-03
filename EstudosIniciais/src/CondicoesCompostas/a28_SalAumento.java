package CondicoesCompostas;

/*28) Desenvolva um programa que leia o nome de um funcionário, seu salário,
quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de
acordo com a tabela a seguir: - Até 3 anos de empresa: aumento de 3%
entre 3 e 10 anos: aumento de 12.5%
10 anos ou mais: aumento de 20%
 */

import java.util.Locale;
import java.util.Scanner;

public class a28_SalAumento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        String name;
        int year;
        double salary, percent;

        System.out.println("Insira o nome do funcionário");
        name = sc.nextLine();

        System.out.println("Quantos anos na empresa?");
        year = sc.nextInt();

        System.out.println("Informe seu salário");
        salary = sc.nextDouble();

        System.out.println(salary);

        if (year <= 3) {
            System.out.println("Olá " + name);
            percent = salary / 100 * 3;
            salary = salary + percent;
            System.out.printf("\nNovo salário com reajuste: R$%.2f", salary);

        } else if (year <= 10) {
            System.out.println("Olá " + name);
            percent = salary / 100 * 12.5;
            salary = salary + percent;
            System.out.printf("Novo salário com reajuste: R$%.2f", salary);

        } else {
            System.out.println("Olá " + name);
            percent = salary / 100 * 20;
            salary = salary + percent;
            System.out.printf("Novo salário com reajuste: R$%.2f", salary);
        }

        sc.close();
    }
}
