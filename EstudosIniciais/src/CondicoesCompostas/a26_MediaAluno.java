package CondicoesCompostas;

/*27) Crie um programa que leia duas notas de um aluno e calcule a sua média,
mostrando uma mensagem no final, de acordo com a média atingida:
 Média até 4.9: REPROVADO
 Média entre 5.0 e 6.9: RECUPERAÇÃO
 Média 7.0 ou superior: APROVADO */

import java.util.Locale;
import java.util.Scanner;

public class a26_MediaAluno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double[] notas = new double[2];
        double media;

        System.out.println("Nota 1:");
        notas[0] = sc.nextDouble();
        System.out.println("Nota 2:");
        notas[1] = sc.nextDouble();

        media = (notas[0] + notas[1]) / 2;
        System.out.println(media);

        if (media <= 4.9) {
            System.out.println("Reprovado");
        } else if (media >= 5 && media <= 6.9) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Aprovado");
        }

        sc.close();
    }
}