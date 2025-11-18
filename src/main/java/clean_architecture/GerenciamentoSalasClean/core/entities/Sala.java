package clean_architecture.GerenciamentoSalasClean.core.entities;

import clean_architecture.GerenciamentoSalasClean.core.enums.TipoDeSala;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Sala {



    private String nome;
    private int quantidadeDeLugares;
    private String descricao;
    private LocalDateTime dataInicio;
    private LocalDateTime dataEncerramento;
    private Long id;
    private TipoDeSala tipoDeSala;
    private String localizacao;
    private String responsavel;

}
