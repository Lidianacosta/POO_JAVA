package Q9;

import java.util.Scanner;

// Escreva um programa que lê um número que representa o valor da carta, de um (ás) a
// treze (rei), e outro número correspondente ao naipe (1 = ouros, 2 = paus, 3 = copas e 4 =
// espadas). O programa deve imprimir o nome da carta por extenso.

public class Q9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String cartaString = null;
        String naipeString = null;
        System.out.print("informe qual é o número da carta: ");
        int cartaNumero = scan.nextInt();
        System.out.print("informe qual é o naipe da carta: ");
        int naipeNumero = scan.nextInt();
        scan.close();

        switch (cartaNumero) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                cartaString = Integer.toString(cartaNumero);
                break;
            case 1:
                cartaString = "ás";
                break;
            case 11:
                cartaString = "Valete";
                break;
            case 12:
                cartaString = "Rainha";
                break;
            case 13:
                cartaString = "Rei";
                break;
            default:
                System.out.println("Carta inexistente");
                return;
        }

        switch (naipeNumero) {
            case 1:
                naipeString = "ouro";
                break;
            case 2:
                naipeString = "paus";
                break;
            case 3:
                naipeString = "copas";
                break;
            case 4:
                naipeString = "espadas";
                break;
            default:
                System.out.println("naipe inexistente");
                return;
        }

        System.out.println("A carta informada foi: "+ cartaString + " " + naipeString);
    }
}
