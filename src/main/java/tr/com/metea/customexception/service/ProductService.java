package tr.com.metea.customexception.service;

import tr.com.metea.customexception.dto.ProductReadDTO;
import tr.com.metea.customexception.dto.ProductWriteDTO;

/**
 * @author Mete Aydin
 * <p>
 * 28.09.2022
 */
public interface ProductService {
    ProductReadDTO create(ProductWriteDTO productWriteDTO);

    ProductReadDTO getById(Long id);

    ProductReadDTO update(Long id, ProductWriteDTO productWriteDTO);

    ProductReadDTO delete(Long id);
}
