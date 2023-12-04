import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o lado do quadrado que deseja saber a área: ");
        double lado = scan.nextDouble();
        System.out.println("Área do quadrado de lado " + lado + " é " + Math.pow(lado, 2));
        scan.close();
    }
}
