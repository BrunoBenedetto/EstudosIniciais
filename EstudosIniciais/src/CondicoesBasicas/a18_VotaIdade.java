package CondicoesBasicas;

/*18) Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
dela e depois mostre se ela pode ou não votar. */


import java.util.Locale;
import java.util.Scanner;

public class a18_VotaIdade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int Ano, Idade, AnoBase = 2026;

        System.out.println("Insira seu ano de nascimento:");
        Ano = sc.nextInt();

        Idade = AnoBase - Ano;

        if(Idade <= 15){
            System.out.printf("Sua idade é %s, e não pode votar", Idade);
        }else{
            System.out.printf("Sua idade é %s, e pode votar", Idade);

            sc.close();
        }
    }
}
