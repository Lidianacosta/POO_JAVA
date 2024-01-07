package Q26.implementacao;

import Q26.modelo.Elevador;

public class MainElevador {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(10,5);
        elevador.desce();
        elevador.sobe();
        elevador.sai();
        elevador.entra();
        System.out.println(elevador);
        
    }
}
