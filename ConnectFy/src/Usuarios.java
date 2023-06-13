import java.util.ArrayList;
import javax.swing.JOptionPane;

// Classe Abstrata
public abstract class Usuarios {
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

    public ArrayList<Usuarios> getAmigos() {
        return amigos;
    }

    public void adicionarAmigo(Usuarios amigo) {
        amigos.add(amigo);
    }

    public void removerAmigo(Usuarios amigo) {
        amigos.remove(amigo);
    }

    public boolean eAmigo(Usuarios usuario) {
        return amigos.contains(usuario);
    }

    public void mandarMensagem() {
        if (amigos.size() > 0) {
            String mensagem = JOptionPane.showInputDialog(null, "Digite a mensagem:", "ConnectFy", JOptionPane.QUESTION_MESSAGE);

            for (Usuarios amigo : amigos) {
                JOptionPane.showMessageDialog(null, "Mensagem enviada para " + amigo.getNome() + "\n"
                        + "Mensagem: " + mensagem, "ConnectFy", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Você não tem amigos para enviar mensagens.", "ConnectFy", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Polimorfismo
    public void realizarAcao() {
        // Implementação padrão
        System.out.println("Realizando ação como um usuário genérico...");
    }
}