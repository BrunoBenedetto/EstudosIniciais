package RepeticaoWhile;

/*53) Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no final:
a) Quantos homens foram cadastrados
b) Quantas mulheres foram cadastradas
c) A média de idade do grupo
d) A média de idade dos homens
e) Quantas mulheres tem mais de 20 anos*/

import java.util.Locale;
import java.util.Scanner;

public class a53_IdadeESexo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int age;
        String gender;
        int i = 0;

        int qntHomem = 0;
        int qntMulher = 0;
        int mulherMais20 = 0;
        double mediaGrupo = 0;
        double mediaHomem = 0;
        double count = 0;
        double countHomen = 0;

        while (i < 5) {

            System.out.println("Digite sua idade: ");
            age = sc.nextInt();

            System.out.println("Agora digite seu sexo. Masculino ou Feminino (M/F): ");
            gender = sc.next();

            if (gender.equalsIgnoreCase("m")) {
                qntHomem++;

                countHomen += age;
                mediaHomem = countHomen / qntHomem;

            }

            if (gender.equalsIgnoreCase("f")) {
                qntMulher++;
                if (age > 20) {
                    mulherMais20++;
                }
            }

            i++;

            count += age;
            mediaGrupo = count / i;

        }
        System.out.printf("a) Quantos homens foram cadastrados: %d\n", qntHomem);
        System.out.printf("b) Quantas mulheres foram cadastradas: %d\n", qntMulher);
        System.out.printf("c) A média de idade do grupo: %.2f\n", mediaGrupo);
        System.out.printf("d) A média de idade dos homens: %.2f\n", mediaHomem);
        System.out.printf("e) Quantas mulheres tem mais de 20 anos:  %d\n", mulherMais20);

        sc.close();
    }
}

