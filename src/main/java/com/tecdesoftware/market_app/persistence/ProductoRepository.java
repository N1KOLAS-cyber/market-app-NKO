package com.tecdesoftware.market_app.persistence;

import com.tecdesoftware.market_app.persistence.crud.ProductoCrudRepository;
import com.tecdesoftware.market_app.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    //Equivalente a poner SELECT * from productos
    public List<Producto> getAll() {
        productoCrudRepository.findAll();
        //se castea de iterable a lista
        return (List<Producto>) productoCrudRepository.findAll();

    }
}
