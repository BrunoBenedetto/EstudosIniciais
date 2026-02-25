package RepeticaoWhile;

/*44) Crie um algoritmo que leia o valor inicial da contagem, o valor final e o
incremento, mostrando em seguida todos os valores no intervalo:
Ex: Digite o primeiro Valor: 3
Digite o último Valor: 10
Digite o incremento: 2
Contagem: 3 5 7 9 Acabou!*/

/*45) O programa acima vai ter um problema quando digitarmos o primeiro valor
maior que o último. Resolva esse problema com um código que funcione em qualquer
situação.*/

import java.util.Scanner;

public class a44_ContIncremento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numInicial, numFinal, Incremento;

        System.out.println("Digite o número inicial");
        numInicial = sc.nextInt();

        System.out.println("Digite o número final");
        numFinal = sc.nextInt();

        System.out.println("Digite o incremento:");
        Incremento = sc.nextInt();

        if (Incremento <= 0) {
            System.out.println("Incremento inválido");
        } else {

            if (numInicial >= numFinal) {
                while (numInicial >= numFinal) {
                    System.out.printf(numInicial + " ");

                    numInicial = numInicial - Incremento;
                }
            } else {

                while (numInicial <= numFinal) {

                    System.out.print(numInicial + " ");

                    numInicial = numInicial + Incremento;
                }
            }
            System.out.print("Acabou!");

            sc.close();
        }
    }
}
