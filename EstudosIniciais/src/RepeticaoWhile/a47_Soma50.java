package RepeticaoWhile;

/*47) Desenvolva um aplicativo que mostre na tela o resultado da expressão 500 +
450 + 400 + 350 + 300 + ... + 50 + 0 */

public class a47_Soma50 {
    public static void main(String[] args) {

        int i = 500;
        int soma = 0;

        while (i > 0) {
            soma = soma + i;
            i = i - 50;
        }
        System.out.println(soma);
    }
}
