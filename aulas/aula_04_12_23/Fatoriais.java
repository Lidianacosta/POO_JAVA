package aula;

import java.util.Scanner;

public class Fatoriais {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int fat = 1;
        for (int i = 1; i <= n; i++) {
            fat = 1;
            for (int j = i; j > 1; j--) {
                fat *= j;
            }
            System.out.println("Fatorial de " + i + " : " + fat);
        }
        scan.close();
    }
}
