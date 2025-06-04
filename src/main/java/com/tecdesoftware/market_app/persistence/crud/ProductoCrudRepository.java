package com.tecdesoftware.market_app.persistence.crud;

import com.tecdesoftware.market_app.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto, Long> {
}
