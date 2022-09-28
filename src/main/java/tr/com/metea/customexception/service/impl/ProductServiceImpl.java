package tr.com.metea.customexception.service.impl;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import tr.com.metea.customexception.domain.Product;
import tr.com.metea.customexception.dto.ProductReadDTO;
import tr.com.metea.customexception.dto.ProductWriteDTO;
import tr.com.metea.customexception.exception.ServiceExecutionException;
import tr.com.metea.customexception.repository.ProductRepository;
import tr.com.metea.customexception.service.ProductService;

/**
 * @author Mete Aydin
 * <p>
 * 28.09.2022
 */
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;

    @Override
    public ProductReadDTO create(ProductWriteDTO productWriteDTO) {
        if(!productWriteDTO.getCode().startsWith("A")){
            throw new ServiceExecutionException("Code must starts with 'A'");
        }
        final var product = productRepository.save(modelMapper.map(productWriteDTO, Product.class));
        return modelMapper.map(product, ProductReadDTO.class);
    }

    @Override
    public ProductReadDTO getById(Long id) {
        final var product = productRepository.findById(id);
        if (product.isEmpty()) {
            throw new ServiceExecutionException("Kayıt Bulunamadı!");
        }
        return modelMapper.map(product.get(), ProductReadDTO.class);
    }

    @Override
    public ProductReadDTO update(Long id, ProductWriteDTO productWriteDTO) {
        return null;
    }

    @Override
    public ProductReadDTO delete(Long id) {
        return null;
    }
}
