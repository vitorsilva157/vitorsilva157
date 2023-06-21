package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conexao;
import entity.Usuario;

public class UsuarioDAO {

    public void cadastrarUsuario(Usuario usuario) {
        String sql = "INSERT INTO USUARIO(ID, NOME, IDADE, TELEFONE, SETOR, VACINAS) VALUES (?, ?, ?, ?, ?, ?)";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, usuario.getId());
            ps.setString(2, usuario.getNome());
            ps.setString(3, usuario.getIdade());
            ps.setString(4, usuario.getTelefone());
            ps.setString(5, usuario.getSetor());
            ps.setString(6, usuario.getVacinas());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

    

