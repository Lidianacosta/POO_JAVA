package Q30.modelo;

public abstract class Maior {

    public static double maior(double n1, double n2){
        return (n1 > n2)? n1: n2;
    }

    public static double maior(double n1, double n2, double n3){
        double m = maior(n1, n2);
        return (n3 > m)? n3: m;
    }

    public static double maior(double n1, double n2, double n3, double n4){
        double m = maior(n1, n2, n3);
        return (n4 > m)? n4:m;
    }
}
