package Q23.modelo;

public class Time {

    String nomeDoTime;
    int numerosDeJogadores;
    int numeroDeVitorias;
    
    public Time(String nomeDoTime, int numerosDeJogadores, int numeroDeVitorias) {
        this.nomeDoTime = nomeDoTime;
        this.numerosDeJogadores = numerosDeJogadores;
        this.numeroDeVitorias = numeroDeVitorias;
    }
    
    public void exibeTime() {
        System.out.println("Nome do time: " + this.nomeDoTime);
        System.out.println("Numero de Jogadores: " + this.numeroDeVitorias);
        System.out.println("Numero de vitórias: " + this.numeroDeVitorias);
    }
}
