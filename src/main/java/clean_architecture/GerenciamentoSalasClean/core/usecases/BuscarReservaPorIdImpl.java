package clean_architecture.GerenciamentoSalasClean.core.usecases;


import clean_architecture.GerenciamentoSalasClean.core.exception.DomainExecption;
import clean_architecture.GerenciamentoSalasClean.core.entities.Sala;
import clean_architecture.GerenciamentoSalasClean.core.gateway.SalaGatway;

public class BuscarReservaPorIdImpl implements BuscarReservaPorIdCase{

    private  final SalaGatway salaGatway;


    public BuscarReservaPorIdImpl(SalaGatway salaGatway) {
        this.salaGatway = salaGatway;
    }



    public Sala execute(Long id) {

        return  salaGatway.buscarSalaPorId(id).orElseThrow(() -> new DomainExecption("Reserva nao encontrada"));
    }
}


