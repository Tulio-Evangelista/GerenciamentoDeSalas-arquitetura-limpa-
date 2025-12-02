package clean_architecture.GerenciamentoSalasClean.core.usecases;

import clean_architecture.GerenciamentoSalasClean.core.entities.Sala;
import clean_architecture.GerenciamentoSalasClean.core.gateway.SalaGatway;

import java.util.List;


public class BuscarReservaCaseImpl implements BuscarReservaCase {



   private final SalaGatway salaGatway;

    public BuscarReservaCaseImpl(SalaGatway salaGatway) {
        this.salaGatway = salaGatway;
    }



    @Override
    public List<Sala> execute() {
        return salaGatway.buscarSalas();
    }


}
