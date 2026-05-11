package Flag;

/*57) Desenvolva um aplicativo que leia o salário e o sexo de vários funcionários.
No final, mostre o total de salários pagos aos homens e o total pago às
mulheres. O programa vai perguntar ao usuário se ele quer continuar ou não
sempre que ler os dados de um funcionário.*/

import java.util.Locale;
import java.util.Scanner;

public class a57_SalFuncio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        boolean continuE = true;

        String gender;
        String conti;
        double salary;
        double salaryH = 0;
        double salaryM = 0;

        while (continuE) {
            System.out.println("Masculino ou Feminino?");
            gender = sc.next();

            System.out.println("Informe seu salário: ");
            salary = sc.nextDouble();

            if (gender.equalsIgnoreCase("m")) {
                salaryH += salary;
            }
            if (gender.equalsIgnoreCase("f")) {
                salaryM += salary;
            }

            System.out.println("Deseja continuar?");
            conti = sc.next();
            if (conti.equalsIgnoreCase("n")) {
                System.out.println("Programa encerrado.");
                continuE = false;
            }
        }

        System.out.printf("Total de salário pago aos Homens R$ %.2f\n", salaryH);
        System.out.printf("Total de salário pago às Mulheres R$ %.2f\n", salaryM);

        sc.close();
    }
}
