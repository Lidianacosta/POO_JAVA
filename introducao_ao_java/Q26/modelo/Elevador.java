package Q26.modelo;

// Crie uma classe denominada Elevador para armazenar as informações de um elevador
// dentro de um prédio. A classe deve armazenar o número do andar atual, o total de
// andares no prédio, a capacidade do elevador e quantas pessoas estão presentes nele.
// Outras classes não devem ter acesso direto aos atributos de Elevador. A classe deve
// também disponibilizar os seguintes métodos:
// • construtor : que deve receber como parâmetros a capacidade do elevador e o total
// de andares no prédio (um elevador sempre começa no térreo e vazio);
// • entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda
// houver espaço);
// • sai : para remover uma pessoa do elevador (só deve remover se houver alguém
// dentro dele);
// • sobe : para subir um andar (não deve subir se já estiver no último andar);
// • desce : para descer um andar (não deve descer se já estiver no térreo).
// Escreva um aplicativo de teste que demonstre as capacidades da classe criada, ou seja,
// execute todos os métodos da classe.

public class Elevador {
    private int numeroAndar;
    private int totalAndares;
    private int capacidadeTotal;
    private int capacidadePresente;
    
    /**
     * @param totalAndares
     * @param capacidadeTotal
     */
    public Elevador(int totalAndares, int capacidadeTotal) {
        this.totalAndares = totalAndares;
        this.capacidadeTotal = capacidadeTotal;
    }

    public void entra() {
        if (this.capacidadePresente >= this.capacidadeTotal)
            System.out.println("Elevador cheio");
        else
            this.capacidadePresente++;
    }

    public void sai() {
        if (this.capacidadePresente <= 0)
            System.out.println("Elevador vazio");
        else
            this.capacidadePresente--;
    }

    public void sobe() {
        if (this.numeroAndar >= this.totalAndares)
            System.out.println("Elevador Está no último andar");
        else
            this.numeroAndar++;
    }

    public void desce() {
        if (this.numeroAndar <= 0)
            System.out.println("Elevador está no térreo");
        else
            this.numeroAndar--;
    }
    
    public int getNumeroAndar() {
        return numeroAndar;
    }
    public void setNumeroAndar(int numeroAndar) {
        this.numeroAndar = numeroAndar;
    }
    public int getTotalAndares() {
        return this.totalAndares;
    }
    public int getCapacidadeTotal() {
        return this.capacidadeTotal;
    }
    public int getCapacidadePresente() {
        return this.capacidadePresente;
    }
    public void setCapacidadePresente(int capacidadePresente) {
        this.capacidadePresente = capacidadePresente;
    }

    @Override
    public String toString() {
        return "Elevador [numeroAndar=" + numeroAndar + ", totalAndares=" + totalAndares + ", capacidadeTotal="
                + capacidadeTotal + ", capacidadePresente=" + capacidadePresente + "]";
    }
}
