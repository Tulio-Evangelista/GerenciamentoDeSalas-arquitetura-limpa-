package clean_architecture.GerenciamentoSalasClean.infra.gateway;


import clean_architecture.GerenciamentoSalasClean.core.entities.Sala;
import clean_architecture.GerenciamentoSalasClean.core.gateway.SalaGatway;
import clean_architecture.GerenciamentoSalasClean.infra.mapper.SalaEntityMapper;
import clean_architecture.GerenciamentoSalasClean.infra.persistence.SalaEntity;
import clean_architecture.GerenciamentoSalasClean.infra.persistence.SalaRepository;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
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
    public  Sala criarSala(Sala sala) {
        SalaEntity salaEntity = new SalaEntity();
        SalaEntity novaSala = mapper.toEntity(sala);
        novaSala = salaRepository.save(novaSala);
        return mapper.toDomain(novaSala);
    }

    @Override
    public boolean existeReserva(String nome,
                                 LocalDateTime dataInicio,
                                 LocalDateTime dataEncerramento) {
        return salaRepository
                .existeReserva(
                        nome,
                        dataInicio,
                        dataEncerramento
                );
    }


    public  List<Sala> buscarSalas() {
        List<SalaEntity> salaEntities = salaRepository.findAll();
        return salaEntities.stream()
                .map(mapper::toDomain)
                .toList();
    }

    public Sala deletarSala(Long id) {
        Optional<SalaEntity> salaEntityOptional = salaRepository.findById(id);
        if (salaEntityOptional.isPresent()) {
            SalaEntity salaEntity = salaEntityOptional.get();
            salaRepository.delete(salaEntity);
            return mapper.toDomain(salaEntity);
        }
        return null;
    }

    public Optional<Sala> buscarSalaPorId(Long id) {
        Optional<SalaEntity> salaEntityOptional = salaRepository.findById(id);
        return salaEntityOptional.map(mapper::toDomain);
    }


}
