package Q25.implementacao;

import Q25.modelo.Aluno;

public class MainAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("12345", "Lidiana", 8.0, 7.8, 3);

        aluno.PassouPorMedia();
        aluno.provaFinal(5);
        
    }
}
