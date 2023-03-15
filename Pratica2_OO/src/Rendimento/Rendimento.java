package Rendimento;

public class Rendimento {
    double investInicial;
    double taxaRendimento;
    int numeroMeses;

    public Rendimento() {

    }
    public Rendimento(double investInicial, double taxaRendimento, int nMeses) {
        this.investInicial = investInicial;
        this.taxaRendimento = taxaRendimento;
        this.numeroMeses = numeroMeses;
    }
    public double CalculoRendimento() {
        return (this.investInicial * this.taxaRendimento * this.numeroMeses)+ this.investInicial;
    }
    public double getInvestInicial() {
        return investInicial;
    }
    public void setInvestInicial(double investInicial) {
        this.investInicial = investInicial;
    }
    public double getTaxaRendimento() {
        return taxaRendimento;
    }
    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
    public int getNumeroMeses() {
        return numeroMeses;
    }
    public void setNumeroMeses(int nMeses) {
        this.numeroMeses = nMeses;
    }
}

