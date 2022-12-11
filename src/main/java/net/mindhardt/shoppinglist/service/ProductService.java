package net.mindhardt.shoppinglist.service;

import net.mindhardt.shoppinglist.form.ProductForm;
import net.mindhardt.shoppinglist.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.mindhardt.shoppinglist.model.Product;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    
    public Product add(ProductForm form) {
        return productRepository.save(new Product(form));
    }
    
    public void remove(Long id) {
        productRepository.deleteById(id);
    }
    
    public Optional<Product> getById(Long id) {
        return productRepository.findById(id);
    }
    
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }
    
    public Product save(Product product) {
        return productRepository.save(product);
    }
}
