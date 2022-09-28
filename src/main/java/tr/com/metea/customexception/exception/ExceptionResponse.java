package tr.com.metea.customexception.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @author Mete Aydin
 * <p>
 * 29.09.2022
 */
@Getter
@Setter
public class ExceptionResponse {
    private String message;
    private LocalDateTime localDateTime;

    public ExceptionResponse(String message) {
        this.message = message;
        this.localDateTime = LocalDateTime.now();
    }
}
