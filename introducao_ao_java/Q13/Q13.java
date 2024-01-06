package Q13;

// Escreva um programa para imprimir uma versão aproximada de um cartão da Mega-Sena
// (somente com os números, respeitando o número de linhas e a distribuição dos números
// nas linhas).


public class Q13 {
    public static void main(String[] args) {
        System.out.println("\t\t\tMega Sena");
        System.out.println(" Você pode jogar marcando um ou dois dos quardardos abaixo");
        System.out.println();
        printNumeros();
        System.out.println();
        printNumeros();
    }

    public static void printNumeros() {
        int pulaLinha = 0;
        for (int i = 1; i <= 60; i++) {
            if (i < 10)
                System.out.print(" [0"+ i +"] ");
            else
                System.out.print(" ["+ i +"] ");

            pulaLinha++;
            if (pulaLinha == 10) {
                System.out.println();
                pulaLinha = 0;
            }
        }
        System.out.println(" Marque aqui para anular este jogo\t\t\t[ ]");
    }
}