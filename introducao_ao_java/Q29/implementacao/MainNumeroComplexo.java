package Q29.implementacao;

import Q29.modelo.NumeroComplexo;

public class MainNumeroComplexo {
    public static void main(String[] args) {
        NumeroComplexo numeroComplexo = new NumeroComplexo();
        NumeroComplexo numeroComplexo2 = new NumeroComplexo(2);
        NumeroComplexo numeroComplexo3 = new NumeroComplexo(2,4);
        
        System.out.println(numeroComplexo);
        System.out.println(numeroComplexo2);
        System.out.println(numeroComplexo3);
    }
}
