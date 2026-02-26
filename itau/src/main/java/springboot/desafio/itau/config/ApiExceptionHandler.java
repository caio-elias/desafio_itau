package springboot.desafio.itau.config;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Void> handleBodyValidation(MethodArgumentNotValidException ex) {
        return ResponseEntity.unprocessableEntity().build(); // 422, body vazio
    }

}