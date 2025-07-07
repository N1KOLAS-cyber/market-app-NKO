package com.tecdesoftware.market_app.domain.service;

import com.tecdesoftware.market_app.domain.Product;
import com.tecdesoftware.market_app.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.getAll();
    }
    public Optional <Product> getProduct(int productId) {
        return productRepository.getProduct(productId);
    }

    public Optional <List<Product>> getByCategory (int categoryId) {
        return productRepository.getByCategory(categoryId);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public boolean delete(int productId) {
        //verificar que existe el producto que se de eliminar
        if (getProduct(productId).isPresent()) {
            productRepository .delete(productId);
            return true;
        } else {
            return false;
        }
    }

}
