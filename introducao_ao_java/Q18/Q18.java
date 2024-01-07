package Q18;

//  Crie uma função recursiva potencia(base,expoente) que, quando chamado, retorna baseexpoente.
//     Por exemplo, potencia(3,4) deve ser implementado como 3 ∗ 3 ∗ 3 ∗ 3. (A saída é apenas 81 nesse exemplo) Assuma que expoente é um inteiro maior ou igual a 1.

public class Q18 {
    public static void main(String[] args) {
        System.out.println("potencia(3,4): " + powRecursivo(3, 4));
    }   
    public static int powRecursivo(int base, int exp) {
        if (exp == 1)
            return base;
        return base * powRecursivo(base, exp-1);
    }
}
