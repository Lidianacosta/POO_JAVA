import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        System.out.print("Digite os graus celsius para a converão: ");
        Scanner scan = new Scanner(System.in);
        double graus_celsius = scan.nextDouble();
        System.out.println( graus_celsius + " graus celsius convertendo para graus fahrenheit fica " + ((graus_celsius * 9/5)+32));
        scan.close();
    }
}