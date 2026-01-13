package clean_architecture.GerenciamentoSalasClean.infra.presentation;


import clean_architecture.GerenciamentoSalasClean.core.exception.DomainExecption;
import clean_architecture.GerenciamentoSalasClean.core.exception.ReservaExisteExeception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DomainExecption.class)
    public ResponseEntity<String> handleNotFound(DomainExecption ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ReservaExisteExeception.class)
    public ResponseEntity<String> handleSalaNaoEncontrada(ReservaExisteExeception ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }
}
