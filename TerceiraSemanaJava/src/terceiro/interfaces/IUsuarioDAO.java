package terceiro.interfaces;

import java.util.List;

import terceiro.models.Usuario;

public interface IUsuarioDAO {
    
    Usuario buscarUsuario(Long id);
	
	List<Usuario> buscarUsuarios();

	Integer cadastrarUsuario(Usuario u, String senha);
	
	Boolean verificarUsuarioESenha(String usuario, String senha);
	
	Integer deletarUsuario(Long id);
		
	Integer editarUsuario(Usuario u);

	List<Usuario> buscarUsuariosPorParteDoNome(String nome);
}