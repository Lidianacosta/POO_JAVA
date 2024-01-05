package Q7;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite três números");
        System.out.print("1º: ");
        int num1 = scan.nextInt();
        System.out.print("2º: ");
        int num2 = scan.nextInt();
        System.out.print("3º: ");
        int num3 = scan.nextInt();

        int menor = num1;

        menor = (menor > num2)? num2: menor;
        menor = (menor > num3)? num3: menor;

        System.out.printf("Dos números: %d, %d e %d o menor é %d\n", num1, num2, num3, menor);

        scan.close();
    }
}
