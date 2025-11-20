package clean_architecture.GerenciamentoSalasClean.core.usecases;

import clean_architecture.GerenciamentoSalasClean.core.entities.Sala;

public interface criarReservaCase {

    public Sala execute(Sala sala);

}
