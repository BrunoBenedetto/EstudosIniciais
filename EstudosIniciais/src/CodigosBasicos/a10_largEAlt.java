package CodigosBasicos;

/*10) Faça um algoritmo que leia a largura e altura de uma parede, calcule e
mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
sabendo que cada litro de tinta pinta uma área de 2metros quadrados.*/

import java.util.Locale;
import java.util.Scanner;

public class a10_largEAlt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double larg, alt, area, tinta;

        System.out.println("Informe a largura da parade");
        larg = sc.nextDouble();

        System.out.println("Informe a altura da parade");
        alt = sc.nextDouble();

        area = larg * alt;

        System.out.printf("Área total em M: %sM\n", area);

        tinta = area / 2;

        System.out.printf("Serão utilizados %sL de tinta", tinta);

        sc.close();
    }
}
