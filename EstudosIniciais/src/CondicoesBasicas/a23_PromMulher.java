package CondicoesBasicas;

/*23) Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
para todos, mas especialmente para mulheres. Faça um programa que leia nome,
sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
que: - Homens ganham 5% de desconto - Mulheres ganham 13% de desconto*/


import java.util.Locale;
import java.util.Scanner;

public class a23_PromMulher {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        String name, sexo;
        double buy, sale, percent;

        System.out.println("Digite seu nome");
        name = sc.nextLine();

        System.out.println("Informe seu sexo M ou F");
        sexo = sc.nextLine();

        System.out.println("Valor total das compras:");
        buy = sc.nextDouble();
        System.out.printf("\nValor da compra R$%.2f", buy);

        if (sexo.equalsIgnoreCase("F")){
            percent = buy * 13 / 100;
            sale = buy - percent;
            System.out.printf("\nDesconto exclusivo de 13%% para Mulheres, valor total R$%.2f", sale);
        }else if (sexo.equalsIgnoreCase("M")){
            percent = buy * 5 / 100;
            sale = buy - percent;
            System.out.printf("\nDesconto para Homens de 5%%, valor total R$%.2f", sale);
        }else
            System.out.println("\nNão houve desconto.");

        sc.close();
    }
}
