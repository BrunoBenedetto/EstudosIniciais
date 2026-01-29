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
        double nota1, nota2, media;

        System.out.println("Informe o nome do aluno:");
        name = sc.nextLine();

        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.printf("A média do aluno foi: %.1f", media);

        if (media >= 7){
            System.out.println("\nAprovado");
        }else{
            System.out.println("\nReprovado");
        }

        sc.close();
    }
}
