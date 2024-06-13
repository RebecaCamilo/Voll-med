package med.voll.api.domain.usuario;

import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository {
    UserDetails findByLogin(String login);
}
