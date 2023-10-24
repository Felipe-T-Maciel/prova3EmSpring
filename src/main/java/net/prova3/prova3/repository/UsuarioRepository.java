package net.prova3.prova3.repository;

import net.prova3.prova3.model.Solicitante;
import net.prova3.prova3.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
