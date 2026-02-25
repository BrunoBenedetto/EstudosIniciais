package RepeticaoWhile;

/*38) Escreva um programa que mostre na tela a seguinte contagem:
6 7 8 9 10 11 Acabou! */

public class a38_Contagem {
    public static void main(String[] args) {

        int i = 6;

        while (i <= 11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.print("Acabou!");
    }
}
