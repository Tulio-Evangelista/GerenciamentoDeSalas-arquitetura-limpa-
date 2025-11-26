package clean_architecture.GerenciamentoSalasClean.infra.presentation;


import clean_architecture.GerenciamentoSalasClean.core.entities.Sala;
import clean_architecture.GerenciamentoSalasClean.core.usecases.CriarReservaCase;
import clean_architecture.GerenciamentoSalasClean.infra.dtos.SalaDto;
import clean_architecture.GerenciamentoSalasClean.infra.mapper.SalaMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
@Data
public class SalaController {


    private final CriarReservaCase criarReservaCase;
    private final SalaMapper salaMapper;

    public SalaController(CriarReservaCase criarReservaCase, SalaMapper salaMapper) {
        this.criarReservaCase = criarReservaCase;
        this.salaMapper = salaMapper;
    }


    @PostMapping("criarReserva")
    public SalaDto criarReserva(@RequestBody SalaDto salaDto) {
        Sala novaReserva = criarReservaCase.execute(salaMapper.toDomain(salaDto));
        return SalaMapper.toDto(novaReserva);
    }
}
