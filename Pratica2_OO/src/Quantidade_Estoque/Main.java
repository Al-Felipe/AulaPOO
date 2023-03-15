package Quantidade_Estoque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estoque estoqueNovo = new Estoque("Pedro", 50, 10);

        System.out.println(estoqueNovo.mostra());

        System.out.println("Quantidade para dar baixa:");
        estoqueNovo.darBaixa(sc.nextInt());

        if(estoqueNovo.precisaRepor()) {
            System.out.println("É necessario repor.");
        }else {
            System.out.println("Não é necessario repor.");
        }
        sc.close();
    }
}