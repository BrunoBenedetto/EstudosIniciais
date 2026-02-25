package CondicoesCompostas;

/*36) Um programa de vida saudável quer dar pontos atividades físicas que podem
ser trocados por dinheiro. O sistema funciona assim:

- Cada hora de atividade física no mês vale pontos
- até 10h de atividade no mês: ganha 2 pontos por hora
- de 10h até 20h de atividade no mês: ganha 5 pontos por hora
- acima de 20h de atividade no mês: ganha 10 pontos por hora
- A cada ponto ganho, o cliente fatura R$0,05 (5 centavos)
 */

import java.util.Locale;
import java.util.Scanner;

public class a35_CalcVida {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double Horas, QntDias, Total;
        double Point = 1;

        System.out.println("Quantas horas por dia você faz atividade física?");
        Horas = sc.nextDouble();

        System.out.println("Quantas vezes no mês você pratica atividade física?");
        QntDias = sc.nextDouble();

        Total = Horas * QntDias;

        Point = Point * Total;

        System.out.println(Point);

        sc.close();
    }
}
