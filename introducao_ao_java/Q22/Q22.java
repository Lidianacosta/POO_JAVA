package Q22;

import java.util.Scanner;

//  Dado um polinômio
// Pn(x) = a0x n + a1x n−1 + · · · + an−1x + an (1)
// este pode ser definido recursivamente como
// Pn(x) = xPn−1(x) + an (2)
// Escreva uma função recursiva para calcular Pn(x). Os parâmetros n, a0, · · · , an e o valor x devem ser solicitados ao usuário na função main.


public class Q22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os dados do polinômio");
        System.out.print("n: ");
        double n = scanner.nextDouble();
        System.out.print("a: " );
        double a = scanner.nextDouble();
        System.out.print("x: ");
        double x = scanner.nextDouble();
        scanner.close();
       
        System.out.printf("P(ax^n) = %.2f\n", polinomio(n, a, x));
    }

    public static double polinomio(double n, double a, double x) {
        if (n == 0)
            return a;
        return x * polinomio(n - 1, a, x) + a;
    }
}
