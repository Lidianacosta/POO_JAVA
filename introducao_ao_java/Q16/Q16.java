package Q16;

// Escreva um programa que determine quais são todos os números de 3 algarismos cuja
// soma dos cubos de seus algarismos sejam iguais ao próprio número.
// • Exemplo: 153 = 1³ + 5³ + 3³ = 1 + 125 + 27.

public class Q16 {
    public static void main(String[] args) {
        System.out.println("Somas dos algarismos");
        for (int i = 100; i <= 999; i++) {
            ehIgualCubo(i);
        }
    }

    public static void ehIgualCubo(final int n) {
        int aux = n;
        int unidade = aux % 10;
        aux = aux / 10;
        int dezena = aux % 10;
        aux = aux / 10;
        int centena = aux % 10;

        int somaCubo = (int) (Math.pow(unidade, 3) + Math.pow(dezena, 3) + Math.pow(centena, 3));

        if(somaCubo == n)
            System.out.printf("%d = %d³ + %d³ + %d³\n", n, centena, dezena, unidade);
    }
}