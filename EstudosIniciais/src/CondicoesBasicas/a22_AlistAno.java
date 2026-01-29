package CondicoesBasicas;

/*22) Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
situação em relação ao alistamento militar. - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
alistamento. - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
alistamento. */

import java.security.DigestException;
import java.util.Locale;
import java.util.Scanner;

public class a22_AlistAno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int AnoBase = 2026;
        int Idade, Difer = 18;

        System.out.println("Informe o ano de nascimento");
        int AnoNasc = sc.nextInt();

        Idade = AnoBase - AnoNasc;

        System.out.print(Idade);

        if(Idade < 18){
            Difer = Difer - Idade;
            System.out.printf("\nNão pode se alistar, faltam %s anos", Difer);
        }else {
            Difer = Idade - Difer;
            System.out.printf("\nPode se alistar ou já se alistou, total de %s anos passados", Difer);
        }

        sc.close();
    }
}
