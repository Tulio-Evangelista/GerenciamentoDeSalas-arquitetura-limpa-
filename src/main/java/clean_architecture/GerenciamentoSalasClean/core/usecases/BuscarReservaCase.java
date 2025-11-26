package clean_architecture.GerenciamentoSalasClean.core.usecases;

import clean_architecture.GerenciamentoSalasClean.core.entities.Sala;

public interface BuscarReservaCase {

    public Sala execute(Long id);
}
