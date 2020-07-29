package br.com.telemedicina;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.telemedicina.entidade.Telefone;
import br.com.telemedicina.entidade.Usuario;
import br.com.telemedicina.repository.TelefoneRepository;
import br.com.telemedicina.repository.UsuarioRepository;

@SpringBootApplication
public class TelemedicinaApplication implements CommandLineRunner {

	@Autowired
	private UsuarioRepository repo;

	@Autowired
	private TelefoneRepository repo_tel;
	
	public static void main(String[] args) {
		SpringApplication.run(TelemedicinaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Usuario usu1 = new Usuario("Diogo Emannuel", "Diogo@gmail.com", "diogo123");
		Usuario usu2 = new Usuario("Maerio Rodrigues", "Mario@gmail.com", "diogo345");
		Usuario usu3 = new Usuario("Carlos Sampaio", "Carlos@gmail.com", "diogo567");
		Usuario usu4 = new Usuario("PEdro MC", "Pedro@gmail.com", "diogo789");
		
		Telefone telefone1 = new Telefone("85464545", "61");
		Telefone telefone2 = new Telefone("23464545", "61");
		Telefone telefone3 = new Telefone("23464545", "61");
		Telefone telefone4 = new Telefone("98964545", "61");
		Telefone telefone5 = new Telefone("23464545", "61");
		Telefone telefone6 = new Telefone("98964545", "61");
		Telefone telefone7 = new Telefone("23464545", "61");
		Telefone telefone8 = new Telefone("98964545", "61");
		
		usu1.getTelefones().addAll(Arrays.asList(telefone1,telefone2));
		usu2.getTelefones().addAll(Arrays.asList(telefone3,telefone4));
		usu3.getTelefones().addAll(Arrays.asList(telefone5,telefone6));
		usu4.getTelefones().addAll(Arrays.asList(telefone7,telefone8));

		telefone1.setUsuario(usu1);
		telefone2.setUsuario(usu1);
		telefone3.setUsuario(usu2);
		telefone4.setUsuario(usu2);
		telefone5.setUsuario(usu2);
		telefone6.setUsuario(usu3);
		telefone7.setUsuario(usu4);
		telefone8.setUsuario(usu4);
		
//		repo.saveAll(Arrays.asList(usu1,usu2,usu3,usu4));
//		repo.save(usu1);
		repo_tel.saveAll(Arrays.asList(telefone1,telefone2,telefone3,telefone4,telefone5,telefone6,telefone7,telefone8));
//		repo_tel.save(telefone1);
		
	}

}
