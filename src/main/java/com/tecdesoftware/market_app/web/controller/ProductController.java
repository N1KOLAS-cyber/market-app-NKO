package com.tecdesoftware.market_app.web.controller;

import com.tecdesoftware.market_app.domain.Product;
import com.tecdesoftware.market_app.domain.service.ProductService;
import com.tecdesoftware.market_app.persistence.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

//Le dice a Spring que va a ser el controlador de una API REST
@RestController
@RequestMapping("/products")
public class ProductController {
    //Inyectar el servicio
    @Autowired
    private ProductService productService;
    @Autowired
    private ProductoRepository productoRepository;

    @GetMapping("/all")
    public List<Product> getAll() {
        return productService.getAll();
    }

    public Optional<Product> getProduct(int productId) {
        return productService.getProduct(productId);
    }

    public Optional<List<Product>> getByCategory(int categoryId) {
        return productService.getByCategory(categoryId);
    }

    public Product save(Product product) {
        return productService.save(product);
    }

    public boolean delete(int productId) {
        return productService.delete(productId);
    }
}