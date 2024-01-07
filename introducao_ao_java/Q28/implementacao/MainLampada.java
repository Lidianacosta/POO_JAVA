package Q28.implementacao;

import Q28.modelo.Lampada;

public class MainLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        System.out.println(lampada.estaLigada());
        lampada.acende();
        System.out.println(lampada.estaLigada());
        lampada.apaga();
        System.out.println(lampada);
    }
}
