package CondicoesCompostas;

/*25) Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
na tela uma das mensagens abaixo: -
O primeiro valor é o maior -
O segundo valor é o maior -
Não existe valor maior, os dois são iguais
 */

import java.util.Scanner;

public class a25_NumMaior {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] num = new int[2];

        System.out.println("Digite o primeiro número");
        num[0] = sc.nextInt();
        System.out.println("Digite o segundo número");
        num[1] = sc.nextInt();

        if (num[0] > num[1]){
            System.out.printf("\nO primeiro valor: %s é o maior", num[0]);
        } else if (num[1] > num[0]) {
            System.out.printf("\nO segundo valor: %s é o maior", num[1]);
        }else{
            System.out.println("Não existe valor maior, os dois são iguais");
        }

        sc.close();
    }
}
