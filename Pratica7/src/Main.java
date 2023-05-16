import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LivroDAO livroDAO = new LivroDAO();

        int opcao = 0;
        while (opcao != 5) {
            System.out.println("Escolha uma opção:");
            System.out.println("<1> Cadastrar Livro");
            System.out.println("<2> Pesquisar Livro por Preço");
            System.out.println("<3> Pesquisar Livro por Título");
            System.out.println("<4> Excluir Livro");
            System.out.println("<5> Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o título do livro:");
                    scanner.nextLine();
                    String titulo = scanner.nextLine();
                    System.out.println("Digite o preço do livro:");
                    double preco = scanner.nextDouble();
                    Livro livro = new Livro();
                    livro.setTitulo(titulo);
                    livro.setPreco(preco);
                    livroDAO.inserirLivro(livro);
                    System.out.println("Livro cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o preço mínimo:");
                    double precoMinimo = scanner.nextDouble();
                    List<Livro> livrosPorPreco = livroDAO.buscarLivroPorPreco(precoMinimo);
                    System.out.println("Livros encontrados:");
                    for (Livro l : livrosPorPreco) {
                        System.out.println("ID: " + l.getId() + ", Título: " + l.getTitulo() + ", Preço: " + l.getPreco());
                    }
                    break;
                case 3:
                    System.out.println("Digite o início do título:");
                    scanner.nextLine();
                    String inicioTitulo = scanner.nextLine();
                    List<Livro> livrosPorTitulo = livroDAO.buscarLivroPorTitulo(inicioTitulo);
                    System.out.println("Livros encontrados:");
                    for (Livro l : livrosPorTitulo) {
                        System.out.println("ID: " + l.getId() + ", Título: " + l.getTitulo() + ", Preço: " + l.getPreco());
                    }
                    break;
                case 4:
                    System.out.println("Digite o ID do livro a ser excluído:");
                    int idExclusao = scanner.nextInt();
                    livroDAO.excluirLivro(idExclusao);
                    System.out.println("Livro excluído com sucesso!");
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}