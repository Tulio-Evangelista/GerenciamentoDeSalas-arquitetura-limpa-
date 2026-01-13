package clean_architecture.GerenciamentoSalasClean.core.exception;

public class DomainExecption extends RuntimeException {


    public DomainExecption(String message) {
        super(message);
    }

}
