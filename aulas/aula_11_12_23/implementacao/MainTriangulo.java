package implementacao;

import modelo.Triangulo;

public class MainTriangulo {
    public static void main(String[] args) {
        Triangulo t1, t2, t3;
        t1 = new Triangulo();
        t1.inicializaTriangulo(2.5, 2.5, 2.5, "isosceles");
        t2 = new Triangulo();
        t2.inicializaTriangulo(2.5, 2.5, 2.5, "isosceles");
        t3 = t1;
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
