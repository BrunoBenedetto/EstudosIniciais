package RepeticaoWhile;

/*39) Faça um algoritmo que mostre na tela a seguinte contagem:
10 9 8 7 6 5 4 3 Acabou! */

public class a39_ContagemAte3 {
    public static void main(String[] args) {

        int i = 10;

        while (i >= 3) {
            System.out.printf(i + " ");
            i--;
        }
        System.out.print("Acabou");
    }
}
