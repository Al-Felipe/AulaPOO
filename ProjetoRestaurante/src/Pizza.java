public class Pizza {

    public String nome;
    public Double valor;
    public Boolean possuiBorda;

    public Double CalcularValor(Boolean possuiBorda){
        if(possuiBorda)
            return valor + 5.00;

        return valor;
    }

    public String ConsultarNome(){
        return nome;
    }
}
