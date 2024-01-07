package Q25.modelo;

public class Aluno {
    String matricula;
    String nome;
    double notaP1;
    double notaP2;
    double notaTrabalho;

    public Aluno(String matricula, String nome, double notaP1, double notaP2, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaP1 = notaP1;
        this.notaP2 = notaP2;
        this.notaTrabalho = notaTrabalho;
    }

    public double media() {
        return (2.5 * notaP1 + 2.5* notaP2 + 2*notaTrabalho) / 7;
    }

    public double mediaFinal(double notaProvaFinal) {
        return (this.media() * 6 + notaProvaFinal* 4) / 10;
    }

    public void provaFinal(double notaProvaFinal) {
        if (mediaFinal(notaProvaFinal) >= 5)
        System.out.println("Aluno aprovado");
    System.out.println("Aluno reprovado");
    }

    public void PassouPorMedia() {
        double media = this.media();
        if (media >= 7)
            System.out.println("Aluno aprovado por media");
        
        else if (media > 3 && media < 7)
            System.out.println("O aluno está de recuperação");
        else
            System.out.println("Aluno reprovado");
    }
}
