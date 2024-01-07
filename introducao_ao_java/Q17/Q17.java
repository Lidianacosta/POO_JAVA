package Q17;

//  Duas cidades, A e B, têm populações de 7000 e 20000 habitantes, respectivamente. A
// cidade A tem um crescimento populacional de 3,5% ao ano, enquanto a população da
// cidade B cresce 1% ao ano. Faça um programa que utilize laço(s) para calcular a quantidade de anos necessária para que a população da cidade A seja maior ou igual a população da cidade B

public class Q17 {
    public static void main(String[] args) {
        long populacaoCidadeA = 7000;
        long populacaoCidadeB = 20000;
        int anos = 0;

        while (populacaoCidadeA < populacaoCidadeB) {
            ++anos;
            populacaoCidadeA *= 1.35;
            populacaoCidadeB *= 1.1;
        }

        System.out.printf("EM %d anos a cidade A obterá uma população maior que B, As populações estaram: A com %d e B com %d habitantes\n", anos, populacaoCidadeA, populacaoCidadeB);
        
    }
}
