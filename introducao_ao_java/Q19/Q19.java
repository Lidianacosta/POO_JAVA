package Q19;

// Escreva uma função que calcule o fatorial de forma recursiva. Para cada chamada recursiva, exiba as saídas em uma linha separada e adicione um nível de recuo (tabulação). Faça o melhor que você puder para tornar a saída limpa, interessante e significativa. Seu objetivo aqui é projetar e implementar um formato de saída que facilite o entendimento da recursão.
// Por exemplo, para uma entrada n = 5, o programa deve exibir:
// 0! = 1
//       1! = 1
//              2! = 2
//                     3! = 6
//                            4! = 24
//                                    5! = 120

public class Q19 {
    public static void main(String[] args) {
        fatRecursivo(5);
    }
    
    public static void fatRecursivo(int n) {
        fatRecursivo(n, 1);
    }

    public static int fatRecursivo(int n,int fat) {
        if (n == 0){
            System.out.printf("%d! = %d\n", n, fat);
            return 1;
        }
        
        fat = n * fatRecursivo(n-1, fat);
        for (int i = 0; i < n; i++)
            System.out.print("\t");

        System.out.printf("%d! = %d\n", n, fat);

        return fat;
    }

}
