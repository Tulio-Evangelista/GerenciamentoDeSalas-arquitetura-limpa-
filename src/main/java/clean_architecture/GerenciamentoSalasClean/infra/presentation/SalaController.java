package clean_architecture.GerenciamentoSalasClean.infra.presentation;


import clean_architecture.GerenciamentoSalasClean.core.entities.Sala;
import clean_architecture.GerenciamentoSalasClean.infra.dtos.SalaDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservas")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SalaController {


    @PostMapping("/criarReserva")
    public String criarReserva(@RequestBody SalaDto salaDto) {
        return "Reserva criada com sucesso!";
    }
}
