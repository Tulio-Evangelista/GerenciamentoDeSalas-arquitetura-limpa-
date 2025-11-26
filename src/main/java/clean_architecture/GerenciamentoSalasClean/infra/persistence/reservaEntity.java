package clean_architecture.GerenciamentoSalasClean.infra.persistence;

import clean_architecture.GerenciamentoSalasClean.core.enums.TipoDeSala;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "sala_reserva")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class reservaEntity {

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


}
