package aula.modelo;

public class EventoAcademico {
    String nomeDoEvento;
    String localDoEvento;
    int numeroDeParticipantes;

    public EventoAcademico(String nomeDoEvento, String localDoEvento, int numeroDeParticipantes){
        this.nomeDoEvento = nomeDoEvento;
        this.localDoEvento = localDoEvento;
        this.numeroDeParticipantes = numeroDeParticipantes;
    }

    public void mostraEvento() {
        System.out.println("Evento: " + this.nomeDoEvento);
        System.out.println("Local: " + this.localDoEvento);
        System.out.println("Numero de participantes: " + this.numeroDeParticipantes);
    }
}
