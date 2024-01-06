package Q11;

import java.util.Scanner;

// Escreva um programa que lê dois pontos no plano cartesiano com coordenadas x e y e
// informa se o segundo ponto está acima, abaixo, à esquerda e/ou à direita do primeiro.

public class Q11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um ponto do plano cartesiano ");
        System.out.print("x: ");
        double x1 = scan.nextDouble();
        System.out.print("y: ");
        double y1 = scan.nextDouble();
        
        System.out.println("Digite um ponto do plano cartesiano para compara com o primeiro");
        System.out.print("x: ");
        double x2 = scan.nextDouble();
        System.out.print("y: ");
        double y2 = scan.nextDouble();
        
        scan.close();

        double esquesdaDireita = distancia(x1, x2);
        double emcimaEmbaixo = distancia(y1, y2);

        if (esquesdaDireita == 0 && emcimaEmbaixo == 0){
            System.out.println("São o mesmo ponto");
            return;
        }

        System.out.printf("O Ponto(%.1f, %.1f) está ", x2, y2);
        if (esquesdaDireita > 0)
            System.out.print("à esquesda ");
        if (esquesdaDireita < 0)
            System.out.print("à direita ");

        if (emcimaEmbaixo != 0)
            System.out.print("e");
        if (emcimaEmbaixo < 0)
            System.out.print(" em cima ");
        if (emcimaEmbaixo > 0)
            System.out.print(" em baixo ");
            
        System.out.printf("do Ponto(%.1f, %.1f)\n", x1, y1);
    }

    public static double distancia(double p1, double p2){
        return p1 - p2;
    }
}
