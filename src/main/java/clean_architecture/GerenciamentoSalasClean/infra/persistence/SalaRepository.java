package clean_architecture.GerenciamentoSalasClean.infra.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaRepository extends JpaRepository<SalaEntity, Long> {
}
