package clean_architecture.GerenciamentoSalasClean.core.usecases;

import clean_architecture.GerenciamentoSalasClean.core.entities.Sala;

import java.util.List;

public interface BuscarReservaCase {

    public List<Sala> execute();
}
