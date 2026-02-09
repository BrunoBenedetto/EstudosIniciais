package CondicoesCompostas;

/*35) Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O
aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para
carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um programa
que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e
quantos Km foram percorridos. No final mostre o preço a ser pago de acordo com a
tabela a seguir: -
        Carros populares (aluguel de R$90 por dia) -
Até 100Km percorridos: R$0,20 por Km -
Acima de 100Km percorridos: R$0,10 por Km -
        Carros de luxo (aluguel de R$150 por dia) -
Até 200Km percorridos: R$0,30 por Km -
Acima de 200Km percorridos: R$0,25 por Km*/

import java.util.Locale;
import java.util.Scanner;

public class a34_AluCarro2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double CarroPop, CarroLuxo;
        double KmPer, ValorKm, ValorTotal = 0, KmTotal = 0;

        System.out.println("Informe qual carro foi alugado" +
                "\nPopular" +
                "\nLuxo");
        String Modelo = sc.nextLine();

        System.out.println("Quantos dias o carro foi alugado?");
        int QntDias = sc.nextInt();

        System.out.println("Quantos Km foram percorridos?");
        KmPer = sc.nextDouble();

        if (Modelo.equalsIgnoreCase("popular")) {
            CarroPop = QntDias * 90;
            if (KmPer <= 100) {
                ValorKm = 0.20;
            } else {
                ValorKm = 0.10;
            }
            KmTotal = ValorKm * KmPer;
            ValorTotal = CarroPop + KmTotal;

            System.out.printf("O valor a ser cobrado será R$%.2f", ValorTotal);
        } else if (Modelo.equalsIgnoreCase("luxo")) {
            CarroLuxo = QntDias * 150;
            if (KmPer <= 200) {
                ValorKm = 0.30;
            } else {
                ValorKm = 0.25;
            }
            KmTotal = ValorKm * KmPer;
            ValorTotal = CarroLuxo + KmTotal;

            System.out.printf("O valor a ser cobrado será R$%.2f", ValorTotal);
        } else {
            System.out.println("Opção Inválida");
        }


        sc.close();
    }
}