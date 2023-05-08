package kyrylo.pavlenko.ecommerce_template.exception.handler;

import kyrylo.pavlenko.ecommerce_template.exception.UserAlreadyExistException;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex,
            HttpHeaders headers, HttpStatusCode status,
            WebRequest request) {
        Map<String, Object> responseBody = new LinkedHashMap<>();
        responseBody.put("timestamp", LocalDate.now());
        responseBody.put("status", status.value());

        List<String> errors = ex.getBindingResult().getFieldErrors()
                .stream()
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .toList();

        responseBody.put("errors", errors);

        return new ResponseEntity<>(responseBody, headers, status);
    }

    @ExceptionHandler(value = UserAlreadyExistException.class)
    protected ResponseEntity<Object> handleUserAlreadyExistsException(
            RuntimeException ex,  WebRequest request)
    {
        Map<String, Object> responseBody = new LinkedHashMap<>();
        responseBody.put("timestamp", LocalDate.now());
        responseBody.put("status", HttpStatus.CONFLICT);
        responseBody.put("errors", ex.getMessage());

        return handleExceptionInternal(ex, responseBody, new HttpHeaders(), HttpStatus.CONFLICT, request);
    }
}
