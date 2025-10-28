package jsp.shopease.service;

import java.util.List;

import org.springframework.stereotype.Component;

import jsp.shopease.model.Product;
import jsp.shopease.repository.ProductRepository;

@Component
public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> getAllProducts(){
       return repo.findAll();
    }

    public Product getById(Long id){
        return repo.findById(id).orElse(null);
    }
}
