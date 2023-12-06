package Q5;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("digite um número: ");
        int n = scan.nextInt();
        System.out.println(inverte(n));
        scan.close();
    }

    public static int inverte(int num) {
        return inverte(num, 0);
    }

    public static int inverte(int num, int numero_invertido) {
        if ((num % 10) == 0)
            return numero_invertido;
            
        numero_invertido = numero_invertido* 10 + (num % 10);
        return inverte(num/10, numero_invertido);
    }
}
