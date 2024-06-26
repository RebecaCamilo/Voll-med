package med.voll.api.domain.paciente;

import med.voll.api.domain.medico.Medico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    Page<Paciente> findAllByAtivo(short ativo, Pageable pageable);

    @Query("""
            select case when p.ativo = 1 then true else false end
            from Paciente p
            where
            p.id = :id
            """)
    Boolean findAtivoById(Long id);

}
