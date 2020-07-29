package br.com.telemedicina.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.telemedicina.entidade.Telefone;
import br.com.telemedicina.repository.TelefoneRepository;

@Service
public class TelefoneService {

	@Autowired
	private TelefoneRepository repo;

	public Telefone buscaTelefone(Integer id) {
		Optional<Telefone> telefone = repo.findById(id);
		return telefone.orElse(null);
	}

	public List<Telefone> listarTelefone() {
		return repo.findAll();
	}

	public Telefone salvarTelefone(Telefone telefone) {
		return repo.save(telefone);
	}

	public void deletartelefone(Integer tel) {
		repo.deleteById(tel);
	}

	public Telefone alterartelefone(Telefone telefone2) {
		Optional<Telefone> telefone = repo.findById(telefone2.getId_telefone());
		return repo.save(telefone2);
	}

}
