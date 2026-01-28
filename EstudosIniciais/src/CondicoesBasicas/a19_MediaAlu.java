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

        sc.close();
    }
}
