package com.baradmin.service;

import com.baradmin.model.Product;
import com.baradmin.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
    private final ProductRepository repo;
    public ProductService(ProductRepository repo) { this.repo = repo; }
    public Product create(Product p) { return repo.save(p); }
    public List<Product> list() { return repo.findAll(); }
}
