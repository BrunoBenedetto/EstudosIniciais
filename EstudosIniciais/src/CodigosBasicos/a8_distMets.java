package CodigosBasicos;

/*8) Desenvolva um programa que leia uma distância em metros e mostre os valores
relativos em outras medidas.
Ex:
Digite uma distância em metros: 185.72
A distância de 185.7m corresponde a:
0.18572Km
1.8572Hm
18.572Dam
1857.2dm
18572.0cm
185720.0mm
*/

import java.util.Locale;
import java.util.Scanner;

public class a8_distMets {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double disM, disKm, disHm, disDam, disdm, discm, dismm;

        System.out.println("Digite uma distância em metros:\n");
        disM = sc.nextDouble();
        System.out.printf("A distância de %.1fm corresponde a: \n", disM);

        disKm = disM / 1000;
        disHm = disM / 100;
        disDam = disM / 10;

        disdm = disM * 10;
        discm = disM * 100;
        dismm = disM * 1000;

        System.out.print(disKm + "Km\n");
        System.out.print(disHm + "Hm\n");
        System.out.print(disDam + "Dam\n");
        System.out.print(disdm + "dm\n");
        System.out.print(discm + "cm\n");
        System.out.print(dismm + "mm\n");


        sc.close();
    }
}
