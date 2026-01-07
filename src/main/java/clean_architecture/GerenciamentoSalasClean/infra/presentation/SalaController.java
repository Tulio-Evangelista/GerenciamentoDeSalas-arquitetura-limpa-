package clean_architecture.GerenciamentoSalasClean.infra.presentation;


import clean_architecture.GerenciamentoSalasClean.core.entities.Sala;
import clean_architecture.GerenciamentoSalasClean.core.usecases.BuscarReservaCase;
import clean_architecture.GerenciamentoSalasClean.core.usecases.BuscarReservaPorIdCase;
import clean_architecture.GerenciamentoSalasClean.core.usecases.CriarReservaCase;
import clean_architecture.GerenciamentoSalasClean.core.usecases.DeletarReservaCase;
import clean_architecture.GerenciamentoSalasClean.infra.dtos.SalaDto;
import clean_architecture.GerenciamentoSalasClean.infra.mapper.SalaMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
@Data
public class SalaController {


    private final CriarReservaCase criarReservaCase;
    private  final BuscarReservaCase buscarReservaCase;
    private final SalaMapper salaMapper;
    private final DeletarReservaCase deletarReservaCase;
    private final BuscarReservaPorIdCase buscarReservaPorIdCase;

    public SalaController(CriarReservaCase criarReservaCase,
                          BuscarReservaCase buscarReservaCase,
                          SalaMapper salaMapper,
                          DeletarReservaCase deletarReservaCase,
                          BuscarReservaPorIdCase buscarReservaPorIdCase) {


        this.criarReservaCase = criarReservaCase;
        this.buscarReservaCase = buscarReservaCase;
        this.salaMapper = salaMapper;
        this.deletarReservaCase = deletarReservaCase;
        this.buscarReservaPorIdCase = buscarReservaPorIdCase;
    }


    @PostMapping("criarReserva")
    public SalaDto criarReserva(@RequestBody SalaDto salaDto) {
        Sala novaReserva = criarReservaCase.execute(salaMapper.toDomain(salaDto));
        return SalaMapper.toDto(novaReserva);
    }

    @GetMapping("buscarReserva")
    public List<SalaDto> buscarReserva() {
        List<Sala> salas = buscarReservaCase.execute();
        return salas.stream()
                .map(SalaMapper::toDto)
                .toList();
    }

    @DeleteMapping("deletarReserva/{id}")
    public void deletarReserva(@PathVariable Long id) {
        Sala deletarReserva = deletarReservaCase.execute(id);
    }

    @GetMapping("buscarSalaPorId/{id}")
    public SalaDto buscarSalaPorId(@PathVariable Long id) {
        Sala sala = buscarReservaPorIdCase.execute(id);
        return SalaMapper.toDto(sala);
    }
}
