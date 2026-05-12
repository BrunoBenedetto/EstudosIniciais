package Flag;

/*58) Faça um algoritmo que leia a idade de vários alunos de uma turma. O programa
vai parar quando for digitada a idade 999. No final, mostre quantos alunos
existem na turma e qual é a média de idade do grupo.*/

import java.util.Scanner;

public class a58_IdadeAlunos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        int count = 0;
        int age;
        double aculm = 0;
        double media = 0;

        while (flag) {

            System.out.println("Insira a sua idade:");
            age = sc.nextInt();

            if (age != 999) {
                count++;
                aculm += age;
                media = aculm / count;
            } else {
                flag = false;
            }

        }

        System.out.printf("Total de alunos: %d\n", count);
        System.out.printf("Média de idade: %.2f\n", media);

        sc.close();
    }
}

