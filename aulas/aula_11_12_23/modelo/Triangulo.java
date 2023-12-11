package modelo;

public class Triangulo {
    double l1;
    double l2;
    double l3;
    String desc;

    public void inicializaTriangulo(double l1, double l2, double l3, String desc) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.desc = desc;
    }

    public double perimetro() {
        return this.l1 + this.l2 + this.l3 ;
    }
    
}
