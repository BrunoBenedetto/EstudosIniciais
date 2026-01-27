package CodigosBasicos;

/*2) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas
vindas para ela:
Ex: Qual é o seu nome? João da Silva
Olá João da Silva, é um prazer te conhecer!*/

import java.util.Scanner;

public class a2_bemVindo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        String name = sc.nextLine();

        System.out.printf("Olá %s, é um prazer te conhecer!", name);

<<<<<<< HEAD
        sc.close();
=======
>>>>>>> 36324949e8acc430275afef742b047eea1437f07
    }
}
