package clean_architecture.GerenciamentoSalasClean.core.exception;

public class ReservaExisteExeception extends DomainExecption {


    public ReservaExisteExeception() {
        super("Já existe uma reserva para esta sala neste horário.");
    }
}
