package clean_architecture.GerenciamentoSalasClean.infra.gateway;


import clean_architecture.GerenciamentoSalasClean.core.entities.Sala;
import clean_architecture.GerenciamentoSalasClean.core.gateway.SalaGatway;
import clean_architecture.GerenciamentoSalasClean.infra.mapper.SalaEntityMapper;
import clean_architecture.GerenciamentoSalasClean.infra.persistence.SalaEntity;
import clean_architecture.GerenciamentoSalasClean.infra.persistence.SalaRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class SalaRepositoryGateway implements SalaGatway {


    private final SalaRepository salaRepository;
    private final SalaEntityMapper mapper;


    public SalaRepositoryGateway(SalaRepository salaRepository, SalaEntityMapper salaEntityMapper) {
        this.salaRepository = salaRepository;
        this.mapper = salaEntityMapper;
    }

    @Override
    public Sala criarSala(Sala sala) {
        SalaEntity salaEntity = new SalaEntity();
        SalaEntity novaSala = mapper.toEntity(sala);
        novaSala = salaRepository.save(novaSala);
        return mapper.toDomain(novaSala);
    }


    public List<Sala> buscarSalas() {
        List<SalaEntity> salaEntities = salaRepository.findAll();
        return salaEntities.stream()
                .map(mapper::toDomain)
                .toList();
    }



}
