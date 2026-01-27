package CodigosBasicos;

/*3) Crie um programa que leia o nome e o salário de um funcionário, mostrando no
final uma mensagem.
Ex: Nome do Funcionário: Maria do Carmo
Salário: 1850,45
O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.*/


import java.util.Scanner;

public class a3_nomeSalario {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Insira o nome: ");
        String name = sc.nextLine();
        System.out.println("Insira o salário: ");
        double salary  = sc.nextDouble();

        System.out.printf("O(a) funcionário(a) %s, tem um salário de R$%.2f em Junho", name ,salary);
    }
}
