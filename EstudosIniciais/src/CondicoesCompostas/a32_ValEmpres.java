package CondicoesCompostas;

/*33) Escreva um programa para aprovar ou não o empréstimo bancário para a compra
de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e
em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que
ela não pode exceder 30% do salário ou então o empréstimo será negado. */

import java.lang.management.MonitorInfo;
import java.util.Locale;
import java.util.Scanner;

public class a32_ValEmpres {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double House, Salary, Percent, Parcel;
        int Year;

        System.out.println("Qual o valor da casa?");
        House = sc.nextDouble();

        System.out.println("Informe seu salário");
        Salary = sc.nextDouble();

        System.out.println("Quantos anos pretende pagar?");
        Year = sc.nextInt();

        Parcel = House / (Year * 12);
        Percent = Salary * 0.30;

        System.out.printf("O valor das parcelas: R$%.2f", Parcel);

        if (Parcel > Percent){
            System.out.println("\nEmprestimo Negado!");
        }else {
            System.out.println("\nO crédito será liberado");
        }

        sc.close();
    }
}
