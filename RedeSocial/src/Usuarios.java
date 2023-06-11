import java.util.ArrayList;

public class Usuarios {
    private String nome, email, senha;
    private ArrayList<Usuarios> amigos;

    public Usuarios(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.amigos = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Usuarios> getAmigos() { return amigos; }

    public void adicionarAmigo(Usuarios amigo) {
        amigos.add(amigo);
    }

    public void removerAmigo(Usuarios amigo) {
        amigos.remove(amigo);
    }

    public boolean eAmigo(Usuarios usuarios){
        return amigos.contains(usuarios);
    }
}
