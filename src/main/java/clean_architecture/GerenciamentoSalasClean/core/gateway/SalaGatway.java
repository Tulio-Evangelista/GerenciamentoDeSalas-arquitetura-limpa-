package clean_architecture.GerenciamentoSalasClean.core.gateway;

import clean_architecture.GerenciamentoSalasClean.core.entities.Sala;

import java.util.List;


public interface SalaGatway {


    public Sala criarSala(Sala sala);

    List<Sala> buscarSalas();

    public Sala deletarSala(Long id);
}
