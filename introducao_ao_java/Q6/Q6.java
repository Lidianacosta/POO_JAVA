package Q6;

import java.util.Scanner;

public class  Q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("digite os minutos: ");
        
        int minutos_coverter = scan.nextInt();

        int dias = minutos_coverter / (24*60);
        minutos_coverter %= (24*60);
        int horas = minutos_coverter / 60;
        minutos_coverter %= 60;
        int minutos = minutos_coverter;

        System.out.println("dias: " + dias);
        System.out.println("horas: " + horas);
        System.out.println("minutos: " + minutos);
    }
}
