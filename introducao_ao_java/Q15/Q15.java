package Q15;

// Escreva um programa que escreve os 4 primeiros números perfeitos. Um número perfeito é aquele que é igual à soma dos seus divisores (exceto o próprio número). Exemplos: 6 = 1 + 2 + 3, 28 = 1 + 2 + 4 + 7 + 14.

public class Q15 {
    public static void main(String[] args) {
        int qtdPerfeito = 0;
        int i = 0;

        while (qtdPerfeito != 4) {
            ++i;
            if (numeroPerfeito(i)){
                System.out.println(i + " é perfeito");
                qtdPerfeito++;
            }
        }
    }

    public static boolean numeroPerfeito(int n) {
        int somaPerfeito = 0;
        for (int i = 1; i < n; i++)
            if (n % i == 0)
                somaPerfeito += i;

        if (somaPerfeito == n)
            return true;
        return false;
    }
}
