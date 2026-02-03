package CondicoesBasicas;

/*24) Faça um algoritmo que pergunte a distância que um passageiro deseja
percorrer em km. Calcule o preço da passagem, cobrando R$0.50 por km para
viagens até 200Km e R$0.45 para viagens mais longas. */

import java.util.Locale;
import java.util.Scanner;

public class a24_KmPercorridoPass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double km, passage;

        System.out.println("Quantos km deseja percorrer?");
        km = sc.nextDouble();

        if(km > 200) {
            passage = km * 0.45;
            System.out.printf("O valor da passagem será R$%.2f", passage);
        }else{
            passage = km * 0.50;
            System.out.printf("O valor da passagem será R$%.2f", passage);

            sc.close();
        }
    }
}