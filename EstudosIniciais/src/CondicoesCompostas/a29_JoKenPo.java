package CondicoesCompostas;

/*29) [DESAFIO] Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)*/

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class a29_JoKenPo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Random rd = new Random();

        int Num;
        String Player;

        System.out.println("""
                Escolha:
                Pedra
                Papel
                Tesoura
                """);

        Player = sc.nextLine();

        Num = rd.nextInt(3);

        if (Num == 0) {
            System.out.println("Pedra");
        } else if (Num == 1) {
            System.out.println("Papel");
        } else {
            System.out.println("Tesoura");
        }

        //verificação do resultado

        if (Player.equalsIgnoreCase("pedra")) {
            if (Num == 0) {
                System.out.println("Empate");
            } else if (Num == 1) {
                System.out.println("Você perdeu!");
            } else {
                System.out.println("Você ganhou!");
            }
        }
        if (Player.equalsIgnoreCase("papel")) {
            if (Num == 0) {
                System.out.println("Você ganhou!");
            } else if (Num == 1) {
                System.out.println("Empate");
            } else {
                System.out.println("Você perdeu!");
            }
        }
        if (Player.equalsIgnoreCase("tesoura")) {
            if (Num == 0) {
                System.out.println("Você perdeu!");
            } else if (Num == 1) {
                System.out.println("Você ganhou!");
            } else {
                System.out.println("Empate");
            }
        }

        sc.close();
    }
}
