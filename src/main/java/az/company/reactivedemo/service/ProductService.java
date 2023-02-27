package az.company.reactivedemo.service;

import az.company.reactivedemo.model.Product;
import az.company.reactivedemo.repository.ProductRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Flux<Product> getProducts() { // whole method takes 10 seconds to execute
        return productRepository.findAll() // 2 products
                .delayElements(Duration.ofSeconds(3)); //for any element add a sleep duration

    }

}
