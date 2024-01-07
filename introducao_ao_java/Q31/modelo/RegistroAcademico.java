package Q31.modelo;

// Escreva uma versão da classe RegistroAcademico (vista em aula) que tenha o campo numeroDeMatriculas declarado como static, e que incremente o valor deste campo cada vez que uma instância da classe for criada. Use o atributo numeroDeMatriculas para definir o atributo matricula automaticamente com um valor diferente para cada instância. Escreva também uma aplicação que crie algumas instâncias da classe para demonstrar seu funcionamento.

public class RegistroAcademico {

    public static int numeroDeMatriculas;

    private String nome;
    private String matricula;
    private int codigoCurso;
    private double percentualDeCobranca;

    public RegistroAcademico(String nome, int codigoCurso, double percentualDeCobranca) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.percentualDeCobranca = percentualDeCobranca;
        this.matricula = Integer.toString(++RegistroAcademico.numeroDeMatriculas);
    }

    public double calculaMensalidade() {
        return this.percentualDeCobranca * this.codigoCurso * 100;
    }
    
    @Override
    public String toString() {
        return "Aluno:\nNome: " + this.nome + "\nMatricula: " + this.matricula + "\nCódigo do curso: " + this.codigoCurso + "\nMensalidade: " + this.calculaMensalidade();
    }
}
