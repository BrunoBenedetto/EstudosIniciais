package RepeticaoWhile;

/*46) Crie um programa que calcule e mostre na tela o resultado da soma entre 6 +
8 + 10 + 12 + 14 + ... + 98 + 100. */

public class a46_SomaTotal {
    public static void main(String[] args) {

        int i = 6;
        int soma = 0;

        while (i <= 100) {
            System.out.print(i + " ");
            soma = soma + i;
            i = i + 2;

        }
        System.out.printf("\nA soma total é %s", soma);
    }
}
