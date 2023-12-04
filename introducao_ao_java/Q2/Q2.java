import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double soma_notas = 0;
        System.out.println("Infome as notas do aluno");
        for (int i = 0; i < 3; i++) {
        System.out.print("Digite a " + (i +1) + "ª nota: " );
        soma_notas += scan.nextDouble();
        }
        System.out.println("A soma das notas: " + soma_notas);
        System.out.println("A média das notas: " + soma_notas/3);
        scan.close();
    }
}
