package CondicoesCompostas;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class a31_CaraCoroa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Random rd = new Random();

        int Coin;
        String Player;

        System.out.println("Escolha entre Cara ou Coroa");
        Player = sc.nextLine();

        System.out.println("Jogando moeda...");

        try {
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }

            Coin = rd.nextInt(2);

            if (Coin == 0) {
                System.out.println("Cara");
            } else {
                System.out.println("Coroa");
            }

            sc.close();
    }
}
