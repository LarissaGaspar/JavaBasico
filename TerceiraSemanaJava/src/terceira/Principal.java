package terceira;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Driver;

//import terceiro.dao.UsuarioDAO;
//import terceiro.models.Usuario;

import conexao.MinhaConexao;

public class Principal {
    
    private static Connection cn =null;

    public static void main(String[] args) {
        
        cn=MinhaConexao.getInstance();
        
        try{
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM TB_USUARIO");

            ResultSet rs = ps.executeQuery();

            while(rs.next()){//pega vários dados -> IF pega só o primeiro
                System.out.println(rs.getLong("idt"));
                System.out.println(rs.getString("nme_usuario"));
            }
        }catch (SQLException e) {
			System.out.println(e);
        }
        
        //UsuarioDAO dao = new UsuarioDAO();
		// Rodar para testar métodos
		// Usuario u = new Usuario();
		// u.setNmeUsuario("Marcus Vinicius");
		// u.setUsrUsuario("usuario.teste");
		// u.setIdt(dao.cadastrarUsuario(u, "123").longValue());
		// dao.verificarUsuarioESenha(u.getUsrUsuario(), "123");
		// u.setNmeUsuario("Teste");
		// dao.editarUsuario(u);
		// u = dao.buscarUsuario(u.getIdt());
		// System.out.print(u.getNmeUsuario());

		/**
		 * 
		 * Crie um método login: Retorna true (Caso usuário e senha esteja correto) e
		 * false(Quando usuário e senha estiver errado) Informe "Login realizado com
		 * sucesso!" caso true ou Seu Usuário ou senha Estão incorretos, informe
		 * novamente. (crie um loop com a opção para sair)
		 */
    }
}