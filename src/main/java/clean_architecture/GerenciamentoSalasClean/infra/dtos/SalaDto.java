package clean_architecture.GerenciamentoSalasClean.infra.dtos;

import clean_architecture.GerenciamentoSalasClean.core.enums.TipoDeSala;

import java.time.LocalDateTime;

public record SalaDto(

        String nome,
        int quantidadeDeLugares,
        String descricao,
        LocalDateTime dataInicio,
        LocalDateTime dataEncerramento,
        Long id,
        TipoDeSala tipoDeSala,
        String localizacao,
        String responsavel
) {
}
