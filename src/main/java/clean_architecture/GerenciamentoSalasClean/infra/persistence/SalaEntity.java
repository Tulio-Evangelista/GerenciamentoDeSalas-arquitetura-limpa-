package clean_architecture.GerenciamentoSalasClean.infra.persistence;

import clean_architecture.GerenciamentoSalasClean.core.enums.TipoDeSala;
import jakarta.persistence.*;

import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "sala_reserva")
@Entity
@RequiredArgsConstructor

public class SalaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int quantidadeDeLugares;
    private String descricao;
    private LocalDateTime dataInicio;
    private LocalDateTime dataEncerramento;
    private String localizacao;
    private String responsavel;

    @Enumerated(EnumType.STRING)
    private TipoDeSala tipoDeSala;


    public SalaEntity() {
    }

    public SalaEntity(Long id, String nome, int quantidadeDeLugares, String descricao, LocalDateTime dataInicio, LocalDateTime dataEncerramento, String localizacao, String responsavel, TipoDeSala tipoDeSala) {
        this.id = id;
        this.nome = nome;
        this.quantidadeDeLugares = quantidadeDeLugares;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataEncerramento = dataEncerramento;
        this.localizacao = localizacao;
        this.responsavel = responsavel;
        this.tipoDeSala = tipoDeSala;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeDeLugares() {
        return quantidadeDeLugares;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public LocalDateTime getDataEncerramento() {
        return dataEncerramento;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public TipoDeSala getTipoDeSala() {
        return tipoDeSala;
    }

}


