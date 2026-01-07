package clean_architecture.GerenciamentoSalasClean.core.usecases;


import clean_architecture.GerenciamentoSalasClean.core.entities.Sala;

public interface BuscarReservaPorIdCase{

    public Sala execute(Long id);

}
