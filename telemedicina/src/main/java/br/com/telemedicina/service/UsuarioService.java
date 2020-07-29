package br.com.telemedicina.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.telemedicina.entidade.Usuario;
import br.com.telemedicina.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repo;
	
	public Usuario buscaUsuario (Integer usu) {
		Optional<Usuario> usuario = repo.findById(usu);
		return usuario.orElse(null);
	}

	public List<Usuario> listarUsuarios() {
		return repo.findAll();
	}
	
	public Usuario salvarUsuario (Usuario usuario) {
		return repo.save(usuario);
	}
	
	public void deletarUsuario(Integer id) {
		repo.deleteById(id);
	}

	public Usuario alterarUsuario(Usuario usuario) {
		Optional<Usuario> usu = repo.findById(usuario.getId()); 
		return repo.save(usuario);
	}

}
