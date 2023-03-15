package Quantidade_Estoque;

public class Estoque {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public Estoque() {
    }
    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        super();
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }
    public void darBaixa(int qtde) {
        if (this.qtdAtual > 0) {
            this.qtdAtual -= qtde;
            System.out.println("Quantidade atual do estoque : " + this.qtdAtual);
        } else
            System.out.println("Quantidade_Estoque.Estoque vazio");
    }
    public String mostra() {
        return getNome() + "\n" + getQtdMinima() + "\n" + getQtdAtual();
    }
    public boolean precisaRepor() {
        if (this.qtdAtual <= this.qtdMinima)
            return true;
        else
            return false;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQtdAtual() {
        return qtdAtual;
    }
    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }
    public int getQtdMinima() {
        return qtdMinima;
    }
    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }
}