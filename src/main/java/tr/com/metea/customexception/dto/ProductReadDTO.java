package tr.com.metea.customexception.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Mete Aydin
 * <p>
 * 28.09.2022
 */
@Getter
@Setter
public class ProductReadDTO extends ProductWriteDTO {
    private Long id;
}
