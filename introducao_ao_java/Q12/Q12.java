package Q12;

import java.util.Calendar;
// import java.util.Date;
import java.util.Scanner;

// O mês de fevereiro de 2015 começou em um domingo. Escreva um programa que, dado
// o número de um dia do mês de fevereiro de 2015 (um valor entre 1 e 28), imprime o dia
// da semana correspondente.
// • Exemplo de entrada: 10
// • Exemplo de saída: O dia 10 será uma terça-feira

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Calendar calendar = Calendar.getInstance();
        
        System.out.print("Digite a data que deseja saber qual dia da semana foi: ");
        int date = scanner.nextInt();
        scanner.close();

        if (date > 28 || date < 1){
            System.out.println("data inválida");
            return;
        }
        
        calendar.set(2015, 1, date);

        int dayOFWeek = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.printf("Dia %d de Fevereiro de 2015 foi", date);

        if(dayOFWeek == 1 || dayOFWeek == 7)
            System.out.print(" um ");
        else
            System.out.print(" uma ");

        switch (dayOFWeek) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;      
            default:
                break;

        }



        // Testes

        // System.out.println(new Date());

        // System.out.println("Data/Hora atual: "+calendar.getTime());
		// System.out.println("Ano: "+calendar.get(Calendar.YEAR));
		// System.out.println("Mês: "+calendar.get(Calendar.MONTH));
		// System.out.println("Dia do Mês: "+calendar.get(Calendar.DAY_OF_MONTH));
		// System.out.println("Semana do mês: "+calendar.get(Calendar.WEEK_OF_MONTH));
		// System.out.println("Dia da semana: "+calendar.get(Calendar.DAY_OF_WEEK));
        
        // calendar.set(2015, 1, 10);
        // System.out.println("Data/Hora atual: "+calendar.getTime());
		// System.out.println("Ano: "+calendar.get(Calendar.YEAR));
		// System.out.println("Mês: "+calendar.get(Calendar.MONTH));
		// System.out.println("Dia do Mês: "+calendar.get(Calendar.DAY_OF_MONTH));
		// System.out.println("Semana do mês: "+calendar.get(Calendar.WEEK_OF_MONTH));
		// System.out.println("Dia da semana: "+calendar.get(Calendar.DAY_OF_WEEK));

    }
}
