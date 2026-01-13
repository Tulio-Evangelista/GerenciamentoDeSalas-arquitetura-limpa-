package clean_architecture.GerenciamentoSalasClean.core.usecases;

import clean_architecture.GerenciamentoSalasClean.core.entities.Sala;
import clean_architecture.GerenciamentoSalasClean.core.exception.ReservaExisteExeception;
import clean_architecture.GerenciamentoSalasClean.core.gateway.SalaGatway;

public class CriarReservaCaseImpl implements CriarReservaCase {


    private final SalaGatway salaGatway;

    public CriarReservaCaseImpl(SalaGatway salaGatway) {
        this.salaGatway = salaGatway;
    }

    @Override
    public Sala execute(Sala sala) {
        if (salaGatway.existeReserva(
                sala.nome(),
                sala.dataInicio(),
                sala.dataEncerramento()
        )) {
            throw new ReservaExisteExeception();
        }
       Sala criarSala = salaGatway.criarSala(sala);
        return criarSala;
    }




}
