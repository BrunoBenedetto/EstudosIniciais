package Flag;

/*59) Crie um programa que leia o sexo e a idade de várias pessoas. O programa vai
perguntar se o usuário quer continuar ou não a cada pessoa. No final, mostre:
a) qual é a maior idade lida
b) quantos homens foram cadastrados
c) qual é a idade da mulher mais jovem
d) qual é a média de idade entre os homens*/

import java.util.Locale;
import java.util.Scanner;

class a59_GenderIdade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        boolean continuE = true;

        String gender;
        String awnser;
        int age;
        int contMen = 0;
        double mediaMen = 0;
        double ageMen = 0;
        int ageUp = 0;
        int ageWom = 9999;
        int contWom = 0;

        while (continuE) {
            System.out.println("Informe seu gênero M/F: ");
            gender = sc.next();

            System.out.println("Agora informe sua idade");
            age = sc.nextInt();

            if (gender.equalsIgnoreCase("f")) {
                contWom++;
                if (age < ageWom) {
                    ageWom = age;
                }
            }


            if (age > ageUp) {
                ageUp = age;
            }

            if (gender.equalsIgnoreCase("M")) {
                contMen++;
                ageMen += age;
                mediaMen = ageMen / contMen;
            }

            System.out.println("Deseja continuar? S/N");
             awnser = sc.next();
             if (awnser.equalsIgnoreCase("n") || awnser.equalsIgnoreCase("nao")) {
                 continuE = false;
                }

        }

        if(contWom == 0){
            ageWom = 0;
        }

        System.out.printf("a) qual é a maior idade lida: %d\n", ageUp);
        System.out.printf("b) quantos homens foram cadastrados: %d\n", contMen);
        System.out.printf("c) qual é a idade da mulher mais jovem: %d\n", ageWom);
        System.out.printf("d) qual é a média de idade entre os homens: %.2f\n", mediaMen);

        sc.close();
    }
}