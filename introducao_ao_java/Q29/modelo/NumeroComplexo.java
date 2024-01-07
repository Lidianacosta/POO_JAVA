package Q29.modelo;

// Escreva uma classe para representar um número complexo. Essa classe deve conter três construtores. Um construtor deverá receber os dois valores (parte real e parte imaginária) como argumentos, o outro somente o valor real, considerando o imaginário como sendo zero, e o terceiro construtor não recebe argumentos, considerando as partes real e imaginária do número complexo como sendo iguais a zero. Escreva um método toString que apresente o número complexo em notação apropriada (ex.: 2 + 4i) e o use em um aplicativo de teste que demonstre as capacidades da classe criada.

public class NumeroComplexo {
    int parteReal;
    int parteImaginaria;
    
    public NumeroComplexo(int parteReal, int parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public NumeroComplexo(int parteReal) {
        this.parteReal = parteReal;
    }

    public NumeroComplexo() {}

    @Override
    public String toString() {
        if (parteReal == 0 && parteImaginaria == 0)
            return "i";
        if (parteReal != 0 && parteImaginaria == 0)
            return  parteReal + " + i";
        if (parteImaginaria != 0 && parteReal == 0)
            return  parteImaginaria + "i";
        return  parteReal + " + " +parteImaginaria + "i";
    }
        
}
