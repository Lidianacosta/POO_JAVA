package Q24.implementacao;

import Q24.modelo.Fatura;

public class MainFatura {
    public static void main(String[] args) {
        Fatura fatura = new Fatura(1, "fone de ouvido", 2, 10.0);
        
        System.out.println(fatura);
    }
}