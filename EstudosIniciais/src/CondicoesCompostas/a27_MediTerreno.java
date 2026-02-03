package CondicoesCompostas;

/*27) Faça um programa que leia a largura e o comprimento de um terreno
retangular, calculando e mostrando a sua área em m². O programa também
devemostrar a classificação desse terreno, de acordo com a lista abaixo: -
Abaixo de 100m² =TERRENO POPULAR
Entre 100m² e 500m² = TERRENO MASTER
Acima de 500m² = TERRENO VIP*/

import java.util.Locale;
import java.util.Scanner;

public class a27_MediTerreno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double width, length, square;

        System.out.println("Informe a largura");
        width = sc.nextDouble();

        System.out.println("Informe o comprimento");
        length = sc.nextDouble();

        square = width * length;

        System.out.printf("O terreno possui %.2f m²", square);

        if (square < 100){
            System.out.println("\nTerreno popular");
        }else if (square >= 100 && square <=500){
            System.out.println("\nTerreno master");
        }else{
            System.out.println("\nTerreno vip");
        }

        sc.close();
    }
}
