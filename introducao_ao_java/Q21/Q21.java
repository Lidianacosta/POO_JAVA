package Q21;

// Crie uma função recursiva que verifique se um dado número é primo.


public class Q21 {
    public static void main(String[] args) {
        EhPrimo(11);
    }

    public static void EhPrimo(int n){
        int somaDivisores = ehPrimo(n, 1);
        System.out.println(somaDivisores);
        
        if (somaDivisores == 2)
            System.out.print(n + " é primo");
        else
            System.out.print(n + " não é primo");
        
        System.out.println(" pois contém " + somaDivisores + " divisores");
    }
    
    public static int ehPrimo(int n, int divisores){ 
        
        if (divisores == n )
            return 1;
        return ehPrimo(n, divisores +1) + ((n%divisores == 0)? 1: 0);
    }

}
