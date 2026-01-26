package CodigosBasicos;

/*5) Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
na tela a sua média na disciplina.
Ex:
Nota 1: 4.5
Nota 2: 8.5
A média entre 4.5 e 8.5 é igual a 6.5 */

import java.util.Scanner;
import java.util.Locale;

public class a5_mediaNota {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double nota1, nota2, media;

        System.out.println("Nota 1:");
        nota1 = sc.nextDouble();
        System.out.println("Nota 2:");
        nota2 = sc.nextDouble();

        media = (nota1+nota2) / 2;

        System.out.printf("A média entre %s e %s é igual a %s", nota1, nota2, media);

        sc.close();
    }
}
