package Q28.modelo;

//  Escreva uma classe Lampada que possui o atributo estadoDaLampada (ligado ou desligado) e os métodos acende, apaga e mostraEstado (ex.: A lampada esta acesa). Inclua um método estaLigada que retorne verdadeiro se lâmpada estiver ligada e falso caso contrário. Adicione um campo que indique quantas vezes a lâmpada foi acesa. Para isso, utilize uma instância da classe Contador criada anteriormente e implemente a lógica necessária para atualizar seu valor. Escreva um aplicativo de teste que demonstre as capacidades da classe criada.

import Q27.modelo.Contador;


public class Lampada {
    private boolean estadoDaLampada;
    private Contador contador= new Contador();

    public void acende() {
        this.estadoDaLampada = true;
        contador.incrementar();
    }

    public void apaga() {
        this.estadoDaLampada = false;
    }

    public void mostraEstado() {
        if (this.estadoDaLampada)
            System.out.println("A lampada está acesa");
        else
            System.out.println("A lampada está apagada");
    }

    public boolean estaLigada() {
        return this.estadoDaLampada;
    }



    @Override
    public String toString() {
        return "Lampada estado: " 
                + ((this.estadoDaLampada)?"acesa":"apagada")
                + ", Foi acesa " + this.contador + " vezes";
    }
}
