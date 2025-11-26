package clean_architecture.GerenciamentoSalasClean.infra.mapper;

import clean_architecture.GerenciamentoSalasClean.core.entities.Sala;
import clean_architecture.GerenciamentoSalasClean.infra.dtos.SalaDto;
import clean_architecture.GerenciamentoSalasClean.infra.persistence.SalaEntity;

public class SalaMapper {

    public static SalaDto toDto(Sala sala) {
        return new SalaDto(
                sala.nome(),
                sala.quantidadeDeLugares(),
                sala.descricao(),
                sala.dataInicio(),
                sala.dataEncerramento(),
                sala.id(),
                sala.tipoDeSala(),
                sala.localizacao(),
                sala.responsavel()
        );
    }

    public Sala toDomain(SalaDto salaDto) {
        return new Sala(
                salaDto.nome(),
                salaDto.quantidadeDeLugares(),
                salaDto.descricao(),
                salaDto.dataInicio(),
                salaDto.dataEncerramento(),
                salaDto.id(),
                salaDto.tipoDeSala(),
                salaDto.localizacao(),
                salaDto.responsavel()
        );
    }

}
