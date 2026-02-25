package CondicoesCompostas;

/*35) Um programa de vida saudável quer dar pontos para atividades físicas que podem
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

        double horas, qntDias, totalMes, premio;
        double point = 0;

        System.out.println("Quantas horas por dia você faz atividade física?");
        horas = sc.nextDouble();

        System.out.println("Quantas vezes no mês você pratica atividade física?");
        qntDias = sc.nextDouble();

        totalMes = horas * qntDias;

        if (totalMes <= 10) {
            point = totalMes * 2;
        } else if (totalMes <= 20) {
            point = totalMes * 5;
        } else {
            point = totalMes * 10;
        }

        premio = point * 0.05;

        System.out.printf("O total de pontos ganhos é %.0f", point);
        System.out.printf("\nO valor ganho foi %.2f", premio);

        sc.close();
    }
}

