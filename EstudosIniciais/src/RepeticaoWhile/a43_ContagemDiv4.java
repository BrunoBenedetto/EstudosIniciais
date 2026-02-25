package RepeticaoWhile;

/*43) Desenvolva um algoritmo que mostre uma contagem regressiva de 30 até 1,
marcando os números que forem divisíveis por 4, exatamente como mostrado abaixo:
30 29 [28] 27 26 25 [24] 23 22 21 [20] 19 18 17 [16]... */

public class a43_ContagemDiv4 {
    public static void main(String[] args) {

        int i = 30;

        while (i >= 1) {
            if (i % 4 == 0) {
                System.out.print("[" + i + "] ");
                i--;
            } else {
                System.out.print(i + " ");
                i--;
            }
        }
    }
}