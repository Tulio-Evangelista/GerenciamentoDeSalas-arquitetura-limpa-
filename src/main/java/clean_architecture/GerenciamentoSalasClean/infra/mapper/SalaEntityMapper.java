package clean_architecture.GerenciamentoSalasClean.infra.mapper;

import clean_architecture.GerenciamentoSalasClean.core.entities.Sala;
import clean_architecture.GerenciamentoSalasClean.infra.persistence.SalaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class SalaEntityMapper {


    public SalaEntity toEntity(Sala sala) {
        return new SalaEntity(
                sala.id(),
                sala.nome(),
                sala.quantidadeDeLugares(),
                sala.descricao(),
                sala.dataInicio(),
                sala.dataEncerramento(),
                sala.localizacao(),
                sala.responsavel(),
                sala.tipoDeSala()
        );

    }

    public Sala toDomain(SalaEntity salaEntity) {
        return new Sala(
                salaEntity.getNome(),
                salaEntity.getQuantidadeDeLugares(),
                salaEntity.getDescricao(),
                salaEntity.getDataInicio(),
                salaEntity.getDataEncerramento(),
                salaEntity.getId(),
                salaEntity.getTipoDeSala(),
                salaEntity.getLocalizacao(),
                salaEntity.getResponsavel()
        );
    }


}
