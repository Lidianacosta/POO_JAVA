package Q14;

import java.util.Scanner;

// Escreva um programa que apresente a série de Fibonacci até o n-ézimo termo. Assuma que n > 0.

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número que deseja saber o fibonacci: ");
        int n = scanner.nextInt();
        scanner.close();
        fib(n);
    }

    public static void fib(int n) {
        int n1 = 1, n2 = 1, aux = 1;

        System.out.print(n1);
        
        for (int i = 1; i < n-1; i++) {
            System.out.print(" + " + n2);
            aux = n1 + n2;
            n1 = n2;
            n2 = aux;
        }
        System.out.println(" = " + n2);
    }
}
