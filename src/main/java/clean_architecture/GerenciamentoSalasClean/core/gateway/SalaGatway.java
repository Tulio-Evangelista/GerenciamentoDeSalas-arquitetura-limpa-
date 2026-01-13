package clean_architecture.GerenciamentoSalasClean.core.gateway;

import clean_architecture.GerenciamentoSalasClean.core.entities.Sala;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


public interface SalaGatway {

    boolean existeReserva(String nome, LocalDateTime dataInicio, LocalDateTime dataEncerramento);

    public Sala criarSala(Sala sala);

    List<Sala> buscarSalas();

    public Sala deletarSala(Long id);

    public Optional<Sala> buscarSalaPorId(Long id);
}
