import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        RedeSocial redeSocial = new RedeSocial();

        int opcoes = 0;
        while (opcoes != 3) {
            opcoes = Integer.parseInt(JOptionPane.showInputDialog("1- Cadastrar Usuario\n2- Fazer login\n3- Sair"));
            switch (opcoes){
                case 1:
                    redeSocial.cadastrarUsuario();
                    break;
                case 2:
                    redeSocial.realizarLogin();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saindo..."); break;
                default: JOptionPane.showMessageDialog(null, "Opcao invalida!"); break;
            }
        }
    }
}
