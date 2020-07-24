package br.com.telemedicina.resource;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.telemedicina.entidade.Usuario;
import br.com.telemedicina.service.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {
	
	@Autowired
	private UsuarioService usuService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Usuario> findUsuario(@PathVariable Integer id){
		Usuario usuarioId = usuService.buscaUsuario(id);
		return ResponseEntity.ok().body(usuarioId);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> saveUsuario (@RequestBody Usuario usuario){
		Usuario newCliente = usuService.salvarUsuario(usuario);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(usuario.getId())
				.toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Usuario> alterarUsuario(@RequestBody Usuario usuario){
		Usuario Usuarionew = usuService.alterarUsuario(usuario);
		return ResponseEntity.ok().body(Usuarionew);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Usuario> deletaProduto(@PathVariable Integer id){
		usuService.deletarUsuario(id);
		return ResponseEntity.noContent().build();
	}

}
