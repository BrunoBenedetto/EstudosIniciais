package CondicoesBasicas;

/*17) Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba
o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida. */

import java.util.Locale;
import java.util.Scanner;

public class a17_CarroKm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double VelCarro, MulAplic, Limite;

        System.out.println("Informe a velocidade do carro");
        VelCarro    = sc.nextDouble();

        Limite = VelCarro - 80;
        MulAplic = Limite * 5;

        if (VelCarro > 80){
            System.out.println("Você foi multado");

            System.out.printf("Multa de R$%.2f, aplicada", MulAplic);
        } else {

            System.out.println("Velocidade permitida");

            sc.close();
        }
    }
}
