package CondicoesCompostas;

/*30) [DESAFIO] Crie um jogo onde o computador vai sortear um número entre 1 e 5 o
jogador vai tentar descobrir qual foi o valor sorteado. */

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class a30_SorteioNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Random rd = new Random();

        int Num, Player;

            System.out.println("Sorteando número ...");
            Num = rd.nextInt(1, 6);

            System.out.println("Digite o número:");
            Player = sc.nextInt();

            if (Player == Num) {
                System.out.println("Número Correto!");
                System.out.printf("O número sorteado foi %s\n", Num);
            } else {
                System.out.println("Número Errado.");
                System.out.printf("O número sorteado foi %s\n", Num);
            }
            sc.close();
        }
    }
