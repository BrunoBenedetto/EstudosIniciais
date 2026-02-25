package RepeticaoWhile;

/*40) Crie um aplicativo que mostre na tela a seguinte contagem:
0 3 6 9 12 15 18 Acabou! */

public class a40_Contagem3 {
    public static void main(String[] args) {

        int i = 0;

        while (i <= 18) {
            System.out.print(i + " ");
            i = i + 3;
        }
        System.out.println("Acabou!");
    }
}
