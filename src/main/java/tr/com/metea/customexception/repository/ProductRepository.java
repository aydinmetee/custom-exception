package tr.com.metea.customexception.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.metea.customexception.domain.Product;

import java.util.Optional;

/**
 * @author Mete Aydin
 * <p>
 * 28.09.2022
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
