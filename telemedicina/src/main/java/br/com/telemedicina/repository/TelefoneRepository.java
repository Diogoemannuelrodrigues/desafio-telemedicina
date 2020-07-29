package br.com.telemedicina.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.telemedicina.entidade.Telefone;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Integer>{

}
