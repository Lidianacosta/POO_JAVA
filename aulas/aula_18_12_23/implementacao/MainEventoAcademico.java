package aula.implementacao;

import aula.modelo.EventoAcademico;

public class MainEventoAcademico {
    public static void main(String[] args) {
        EventoAcademico evento = new EventoAcademico("ecop", "Ufersa", 600);
        
        evento.mostraEvento();
    }
}
