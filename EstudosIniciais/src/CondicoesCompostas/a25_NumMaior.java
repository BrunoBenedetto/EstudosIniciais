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

        int num1, num2;

        System.out.println("Digite o primeiro número");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo número");
        num2 = sc.nextInt();

        if (num1 > num2){
            System.out.printf("\nO primeiro valor %s é o maior", num1);
        } else if (num2 > num1) {
            System.out.printf("\nO segundo valor %s é o maior", num2);
        }else{
            System.out.println("Não existe valor maior, os dois são iguais");

            sc.close();
        }
    }
}
