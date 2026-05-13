package Flag;

import java.util.Locale;
import java.util.Scanner;

/*60) Desenvolva um algoritmo que leia o nome, a idade e o sexo de várias pessoas.
O programa vai perguntar se o usuário quer ou não continuar. No final, mostre:
a) O nome da pessoa mais velha
b) O nome da mulher mais jovem
c) A média de idade do grupo
d) Quantos homens tem mais de 30 anos
e) Quantas mulheres tem menos de 18 anos*/

public class a60_NomeIdadeGend {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        boolean cont = true;

        String name;
        String nameMax = "";
        String nameWom = "";
        String gender;
        String stop;

        double countAge = 0;
        double mediaAge = 0;

        int age;
        int age30 = 0;
        int ageMax = 0;
        int ageWom = 999;
        int age18 = 0;
        int contWom = 0;
        int i = 0;

        while (cont) {

            i++;

            System.out.println("Digite seu nome: ");
            name = sc.next();

            System.out.println("Qual sua idade: ");
            age = sc.nextInt();

            System.out.println("Qual seu gênero? M/F");
            gender = sc.next();

            countAge += age;
            mediaAge = countAge / i;

            if (age > ageMax) {
                ageMax = age;
                nameMax = name;
            }

            if (gender.equalsIgnoreCase("m")) {

                if (age > 30) {
                    age30++;
                }
            }

            if (gender.equalsIgnoreCase("f")) {

                contWom++;

                if (age < ageWom) {
                    ageWom = age;
                    nameWom = name;
                }

                if (age < 18) {
                    age18++;
                }
            }

            System.out.println("Deseja continuar?");
            stop = sc.next();

            if (stop.equalsIgnoreCase("n")) {
                cont = false;
            }
        }

        if (contWom == 0) {
            nameWom = "Nenhuma mulher cadastrada";
        }

        System.out.printf("a) O nome da pessoa mais velha: %s\n", nameMax);
        System.out.printf("b) O nome da mulher mais jovem: %s\n", nameWom);
        System.out.printf("c) A média de idade do grupo: %.2f\n", mediaAge);
        System.out.printf("d) Quantos homens tem mais de 30 anos: %d\n", age30);
        System.out.printf("e) Quantas mulheres tem menos de 18 anos: %d\n", age18);

        sc.close();
    }
}