package com.tecdesoftware.market_app.persistence.crud;

import com.tecdesoftware.market_app.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    //query metodos
    //obtener una lista de productos filtrados por id de categoria y ordenanados por acedentenmente por nombre
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    //obtener los porductos escasos
    Optional <List<Producto>> findByCantidadStockLessThanAndEstado(int cantidad, boolean estado);
}
