package CondicoesBasicas;

/*19) Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
não um bom aproveitamento (se ficou acima da média 7.0). */

import java.util.Scanner;
import java.util.Locale;

public class a19_MediaAlu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        String name;
        double[] notas = new double[2];
        double media;

        System.out.println("Informe o nome do aluno:");
        name = sc.nextLine();

        System.out.println("Digite a primeira nota: ");
        notas[0] = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        notas[1] = sc.nextDouble();

        media = (notas[0] + notas[1]) / 2;

        System.out.printf("A média do aluno: %s foi: %.1f",name, media);

        if (media >= 7){
            System.out.println("\nAprovado");
        }else{
            System.out.println("\nReprovado");
        }

        sc.close();
    }
}
