package Q24.modelo;

public class Fatura {
    
    int numeroDeIdentificação;
    String descrição;
    int quantidadeComprada;
    double precoUnitario;
    
    public Fatura(int numeroDeIdentificação, String descrição, int quantidadeComprada, double precoUnitario) {
        this.numeroDeIdentificação = numeroDeIdentificação;
        this.descrição = descrição;

        if (quantidadeComprada > 0) 
            this.quantidadeComprada = quantidadeComprada;

        if (precoUnitario > 0)
            this.precoUnitario = precoUnitario;
        
    }

    public double calculaTotal() {
        return this.quantidadeComprada * this.precoUnitario;
    }
    
    
    @Override
    public String toString() {
        return "Fatura:\nNumero de Identificação: " + numeroDeIdentificação + "\ndescrição: " + descrição
                + "\nquantidadeComprada: " + quantidadeComprada + "\nprecoUnitario: " + precoUnitario + "\nTotal: " + this.calculaTotal();
    }
}
