package Q20;

// Crie uma função recursiva mdc que retorna o máximo divisor comum de m e n. O mdc de m e n é definido recursivamente como segue:
// • se n > m, retorne mdc(n, m);
// • se n = 0, retorne m;
// • senão, retorne mdc(n, m%n), onde % é o operador de resto da divisão

public class Q20 {
    public static void main(String[] args) {
        System.out.println(mdc(15, 21));
    }

    public static int mdc(int n, int m) {
        if (m == 0)
            return n;

        if (n > m)
            return mdc(n % m, m);

        if (n == 0)
            return m;

        return mdc(n, m % n);
    }
}
