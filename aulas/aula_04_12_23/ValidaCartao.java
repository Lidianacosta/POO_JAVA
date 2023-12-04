package aula;
import java.util.Calendar;
import java.util.Scanner;

public class ValidaCartao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        final int MES_ATUAL = calendar.get(Calendar.MONTH) + 1;
        final int ANO_ATUAL = calendar.get(Calendar.YEAR);
        String nome, numero, codigo;
        int ano, mes;

        boolean cartaoInvalido = false;

        System.out.print("nome: ");
        nome = scan.nextLine();
        System.out.print("numero: ");
        numero = scan.nextLine();
        System.out.print("codigo: ");
        codigo = scan.nextLine();

        do {
            if (cartaoInvalido)
                System.out.println("infromações do crtao incoreta insira novamente");
            
            System.out.print("mes: ");
            mes = scan.nextInt();
            System.out.print("ano: ");
            ano = scan.nextInt();
            cartaoInvalido = ano < ANO_ATUAL || (mes==MES_ATUAL && ano==ANO_ATUAL);
        } while (cartaoInvalido);
        
        System.out.println("Cartao valido");
        scan.close();
    }
}
