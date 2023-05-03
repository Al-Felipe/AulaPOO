import java.util.ArrayList;

public class RedeSocial {
    private String dataCriacao;
    private String nomeUsuario;
    private String dataNascimento;
    private String senha;

    ArrayList<Publicacao> publicacoes = new ArrayList<>();

    public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
        this.dataCriacao = dataCriacao;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }

    public void inserePublicacao(Publicacao publi, int param1) {
        publicacoes.add(publi);
    }

    public void imprimePublicacoes(){
        System.out.println("Total de publicacoes: " + Publicacao.getContadorPublicacao());
        for(int i = 0; i < publicacoes.size();i++){
            System.out.println("Data da publicacao: " + publicacoes.get(i).getDataPublicacao());
            System.out.println("Texto da publicacao: " + publicacoes.get(i).getTextoPublicacao());
        }
    }

}
