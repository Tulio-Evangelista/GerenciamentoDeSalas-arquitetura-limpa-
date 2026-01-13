package clean_architecture.GerenciamentoSalasClean.infra.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;

public interface SalaRepository extends JpaRepository<SalaEntity, Long> {

    @Query("""
    SELECT COUNT(s) > 0
    FROM SalaEntity s
    WHERE s.nome = :nome
      AND (:dataInicio < s.dataEncerramento
           AND :dataEncerramento > s.dataInicio)
""")
    boolean existeReserva(
            @Param("nome") String nome,
            @Param("dataInicio")LocalDateTime dataInicio,
            @Param("dataEncerramento") LocalDateTime dataEncerramento
    );

}
