package Rendimento;
import java.util.Scanner;

public class Rendimento_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rendimento investimento1 = new Rendimento();

        System.out.println("Informe o investimento inicial:");
        investimento1.setInvestInicial(sc.nextDouble());
        System.out.println("Informe a taxa ao mes(ex.: 0.02):");
        investimento1.setTaxaRendimento(sc.nextDouble());
        System.out.println("Informe o numero de meses:");
        investimento1.setNumeroMeses(sc.nextInt());

        System.out.println(investimento1.CalculoRendimento());

        sc.close();
    }
}