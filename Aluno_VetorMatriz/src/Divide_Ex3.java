import javax.swing.JOptionPane;

public class Divide_Ex3 {
    public static void main(String[] args) {
        int dividendo, divisor;
        while (true){
            dividendo = Integer.parseInt(JOptionPane.showInputDialog("Digite o dividendo"));
            divisor = Integer.parseInt(JOptionPane.showInputDialog("Digite divisor: "));
            divide(dividendo, divisor);
            break;
        } catch(ArithmeticException e1) {
            JOptionPane.showMessageDialog(null, "Nao pode dividir por zero");
        } catch(NumberFormatException e2) {
            JOptionPane.showMessageDialog(null, "Favor informar apenas numeros inteiros");
        }
    }
}
