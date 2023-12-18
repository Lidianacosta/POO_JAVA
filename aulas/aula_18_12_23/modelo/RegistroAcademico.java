package aula.modelo;

public class RegistroAcademico {
    String nome;
    String matricula;
    int codigoCurso;
    double percentualDeCobranca;


    public RegistroAcademico(String nome, String matricula, int codigoCurso, double percentualDeCobranca) {
        this.nome = nome;
        this.matricula = matricula;
        this.codigoCurso = codigoCurso;
        this.percentualDeCobranca = percentualDeCobranca;
    }

    public double calculaMensalidade() {
        return this.percentualDeCobranca * this.codigoCurso * 100;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
