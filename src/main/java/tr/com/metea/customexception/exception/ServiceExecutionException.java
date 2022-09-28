package tr.com.metea.customexception.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Mete Aydin
 * <p>
 * 29.09.2022
 */
@Getter
@Setter
@AllArgsConstructor
public class ServiceExecutionException extends RuntimeException {
    private String message;
}
