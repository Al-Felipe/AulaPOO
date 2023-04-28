import javax.swing.*;

public class Divide_Ex4 {
    public static void main(String[] args) {
        System.out.println("Inicio do Programa");

        try {
            int a = Integer.parseInt(JOptionPane.showInputDialog("a: "));
            int b = Integer.parseInt(JOptionPane.showInputDialog("b: "));
            System.out.println("Divisao = " + (a/b));
            System.out.println("Soma = " + (a + b));
            System.out.println("Mulplicacao = " + (a*b));
            System.out.println("Subtracao = " + (a-b));
        } catch (ArithmeticException e1) {
            System.out.println("Nao pode dividir por zero");
        } catch (NumberFormatException e2) {
            System.out.println("Digite um numero valido");
        }
        System.out.println("Fim do programa");
    }
}
