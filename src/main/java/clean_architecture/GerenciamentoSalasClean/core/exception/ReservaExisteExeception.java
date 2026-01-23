package clean_architecture.GerenciamentoSalasClean.core.exception;

public class ReservaExisteExeception extends RuntimeException {


    public ReservaExisteExeception(String message) {
        super( message );
    }
}
