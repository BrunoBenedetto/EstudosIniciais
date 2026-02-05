package CondicoesCompostas;

/*34) O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no
peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o
indivíduo dentro de certas faixas. -
abaixo de 18.5: Abaixo do peso -
entre 18.5 e 25: Peso ideal -
entre 25 e 30: Sobrepeso -
entre 30 e 40: Obesidade -
acima de 40: Obseidade mórbida
Obs: O IMC é calculado pela expressão peso/altura² (peso dividido pelo quadrado
da altura) */

import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class a33_CalcIMC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double Weight, Height, IMC;

        System.out.println("Informe seu peso");
        Weight = sc.nextDouble();

        System.out.println("Agora sua altura");
        Height = sc.nextDouble();

        IMC = Weight / (Height * Height);

        System.out.println("Calculando ...");

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println(IMC);

        if (IMC < 18.4) {
            System.out.println("\nAbaixo do peso");
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("\nPeso ideal");
        } else if (IMC >= 25 && IMC <= 29.9) {
            System.out.println("\nSobrepeso");
        } else if (IMC >= 30 && IMC <= 40) {
            System.out.println("\nObesidade");
        } else {
            System.out.println("\nObseidade mórbida");
        }

        sc.close();
    }
}
