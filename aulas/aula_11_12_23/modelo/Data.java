package modelo;

public class Data {
    int dia;
    int mes;
    int ano;
    
    public Data() {}

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public boolean dataEhValida() {
        return (
            this.dia >= 1 && 
            this.dia <= 30 && 
            this.mes >= 1 && 
            this.mes <= 12 && 
            this.ano > 0
        );
    }

    public boolean dataEhValida(int dia, int mes, int ano) {
        return (
            this.dia >= 1 && 
            this.dia <= 30 && 
            this.mes >= 1 && 
            this.mes <= 12 && 
            this.ano > 0
        );
    }

    public void inicializaData(int dia, int mes, int ano) {
        if (dataEhValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }else
            System.out.println("Data invalida");
    }   

    public void mostraData() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}
