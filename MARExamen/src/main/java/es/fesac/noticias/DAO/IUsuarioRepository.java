package es.fesac.noticias.DAO;

import org.springframework.data.jpa.repository.Query;
import es.fesac.noticias.model.Usuario;




public interface IUsuarioRepository {

	@Query(value = "SELECT * FROM Usuario WHERE EMAIL = :email AND PASSWORD = MD5(:password)",nativeQuery = true)
	public Usuario getByEmailAndPassword(String email, String password);
}
