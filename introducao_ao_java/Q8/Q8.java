package Q8;

import java.util.Scanner;

//  Para alavancar as vendas, uma loja resolveu fazer a seguinte promoção relâmpago em
// dois setores:
// • No setor de Eletros, que possui código 222, todas as peças que custam mais de R$
// 500 vão ter 10% de desconto.
// • No setor de Cama, mesa e banho, que possui código 111, peças com valor acima
// de R$ 100 vão ter 40% de desconto, peças que custam entre R$ 50 e R$ 100 vão ter
// 20% de desconto e peças abaixo de R$ 50 vão ter 10% de desconto.
// Escreva um programa que recebe do usuário o código do setor da loja e o valor original de
// um produto e imprime na tela o nome do setor e o valor do produto com desconto. Caso
// o usuário forneça um código diferente de 111 ou 222, exiba a mensagem Setor Invalido

public class Q8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String setor = null;
        int desconto = 0;
        
        System.out.print("digite o codigo do setor: ");
        int codigo = scan.nextInt();
        System.out.print("digite o preço do produto: ");
        double preco = scan.nextDouble();

        scan.close();

        if (preco < 0){
            System.out.println("O preço não pode ser negativo!");
            return;
        }

        switch (codigo) {
            case 111:
                desconto = 10;
                if (preco > 100)
                    desconto = 40;
                if (preco >= 50 & preco <=100)
                    desconto = 20;
                setor = "Cama, mesa e banho";
                break;
            case 222:
                if (preco > 500)
                    desconto = 10;
                setor = "Eletros";
                break;
            default:
                System.out.println("Setor inválido");
                return;
        }

        if (desconto != 0)
            System.out.println("Compra foi feita no setor de " + setor +", preço a pagar: " + (preco - (preco*desconto)/100) + " com desconto de: " + desconto +"%");
        else
            System.out.println("Compra foi feita no setor de " + setor +", preço a pagar: " + preco);

    }
}
