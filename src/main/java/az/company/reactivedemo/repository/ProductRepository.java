package az.company.reactivedemo.repository;

import az.company.reactivedemo.model.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProductRepository extends ReactiveCrudRepository<Product, Integer> {
}
