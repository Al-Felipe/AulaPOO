import javax.swing.JOptionPane;

public class Restaurante {
    public static void main(String[] args) {
        String opcao = JOptionPane.showInputDialog("Informe o pedido\n 1. Hamburger\n 2. Pizza\n 3. Sair");

        if(opcao.equals("1")){
            String nomeHamburguer = JOptionPane.showInputDialog("Informe o nome do hamburguer: ");
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do hamburguer"));

            String artesanal = JOptionPane.showInputDialog("Voce deseja borda?\n S - Sim \n N - Nao");
            boolean calculoArtesanal;

            if(artesanal.equals("S"))
                calculoArtesanal = true;
            else
                calculoArtesanal = false;

            Hamburguer h = new Hamburguer();
            h.nome = nomeHamburguer;
            h.valor = valor;

            double valorTotal = h.CalcularValor(calculoArtesanal);

            JOptionPane.showMessageDialog(null, "Pedido " + valorTotal, "Pedido", JOptionPane.INFORMATION_MESSAGE);
        }

        if(opcao.equals("2")){
            String nomePizza = JOptionPane.showInputDialog("Informe o nome da pizza: ");
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da pizza"));

           String bordaDigitada = JOptionPane.showInputDialog("Voce deseja borda?\n S - Sim \n N - Nao");
           boolean bordaParaCalculo;

           if(bordaDigitada.equals("S"))
               bordaParaCalculo = true;
                else
                    bordaParaCalculo = false;

           Pizza p = new Pizza();
           p.nome = nomePizza;
           p.valor = valor;

           double valorTotal = p.CalcularValor(bordaParaCalculo);

           JOptionPane.showMessageDialog(null, "Pedido " + valorTotal, "Pedido", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
