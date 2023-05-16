import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LivroDAO {
    public void inserirLivro(Livro livro) {
        String sql = "insert into livro (titulo, vl_preco) values (?, ?)";
        try (Connection conexao = ConexaoBD.obterConexao();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, livro.getTitulo());
            stmt.setDouble(2, livro.getPreco());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void excluirLivro(int id) {
        String sql = "delete from livros where id = ?";
        try (Connection conexao = ConexaoBD.obterConexao();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Livro> buscarLivroPorTitulo(String titulo) {
        List<Livro> livros = new ArrayList<>();
        String sql = "select * from livro where titulo like ?";
        try (Connection conexao = ConexaoBD.obterConexao();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, titulo + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Livro livro = new Livro();
                livro.setId(rs.getInt("id_categoria"));
                livro.setTitulo(rs.getString("nm_titulo"));
                livro.setPreco(rs.getDouble("vl_preco"));
                livros.add(livro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return livros;
    }
    public List<Livro> buscarLivroPorPreco(double precoMinimo) {
        List<Livro> livros = new ArrayList<>();
        String sql = "select * from livro where vl_preco >= ?";
        try (Connection conexao = ConexaoBD.obterConexao();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setDouble(1, precoMinimo);


            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Livro livro = new Livro();
                livro.setId(rs.getInt("id_categoria"));
                livro.setTitulo(rs.getString("nm_titulo"));
                livro.setPreco(rs.getDouble("vl_preco"));
                livros.add(livro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return livros;
}
}
