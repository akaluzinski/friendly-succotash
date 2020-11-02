package eu.kaluzinski.repositories;

import eu.kaluzinski.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer>{
}
