package tr.com.metea.customexception.endpoint;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.metea.customexception.dto.ProductReadDTO;
import tr.com.metea.customexception.dto.ProductWriteDTO;
import tr.com.metea.customexception.service.ProductService;

/**
 * @author Mete Aydin
 * <p>
 * 28.09.2022
 */
@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public ResponseEntity<ProductReadDTO> create(@RequestBody ProductWriteDTO dto) {
        return ResponseEntity.ok(productService.create(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductReadDTO> update(@PathVariable("id") Long id, @RequestBody ProductWriteDTO dto) {
        return ResponseEntity.ok(productService.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ProductReadDTO> delete(@PathVariable("id") Long id) {
        return ResponseEntity.ok(productService.delete(id));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductReadDTO> getById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(productService.getById(id));
    }
}
