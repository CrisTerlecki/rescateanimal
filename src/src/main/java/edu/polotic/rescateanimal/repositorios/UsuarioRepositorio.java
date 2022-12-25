package edu.polotic.rescateanimal.repositorios;
import edu.polotic.rescateanimal.entidades.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends CrudRepository<Usuario, Long> {

    Usuario findByEmail(String email);

    boolean existsByEmail(String email);
    
}