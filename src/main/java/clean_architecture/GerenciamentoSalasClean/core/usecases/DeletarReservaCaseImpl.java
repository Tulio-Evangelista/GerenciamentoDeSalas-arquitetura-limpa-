package clean_architecture.GerenciamentoSalasClean.core.usecases;
import clean_architecture.GerenciamentoSalasClean.core.entities.Sala;
import clean_architecture.GerenciamentoSalasClean.core.gateway.SalaGatway;


public class DeletarReservaCaseImpl implements DeletarReservaCase {

    private final SalaGatway salaGatway;

    public DeletarReservaCaseImpl(SalaGatway salaGatway) {
        this.salaGatway = salaGatway;
    }

    public Sala execute(Long id) {
        salaGatway.deletarSala(id);

        return null;
    }
}