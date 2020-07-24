package br.com.telemedicina.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.telemedicina.entidade.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

//	
//	@Autowired 
//	SessionFactory session = null;
//
//	public Usuario saveUsuario(Usuario usu) {
//		getSession().save(usu);
//	}
//
//	@SuppressWarnings("unchecked")
//	public List<Usuario> getUsuarios() {
//		return getSession().createCriteria(Usuario.class).list();
//	}
//
//	private Session getSession() {
//		Session session = factory.getCurrentSession();
//		if (session == null) {
//			session = factory.openSession();
//		}
//		return session;
//	}
}
