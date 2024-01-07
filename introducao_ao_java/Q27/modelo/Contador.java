package Q27.modelo;

// Escreva a classe Contador que encapsule um valor usado para contagem de eventos. Esta classe deve esconder o valor encapsulado de programadores-usuários, fazendo com que o acesso ao valor seja feito através de métodos que devem zerar, incrementar e imprimir o valor do contador. Escreva um aplicativo de teste que demonstre as capacidades da classe criada.

public class Contador {
    private int eventos;

    public void zerar() {
        this.eventos = 0;
    }

    public void incrementar() {
        this.eventos++;
    }

    public void imprimir() {
        System.out.println("Eventos: " + this);
    }
    
    @Override
    public String toString() {
        return Integer.toString(this.eventos);
    }
}
