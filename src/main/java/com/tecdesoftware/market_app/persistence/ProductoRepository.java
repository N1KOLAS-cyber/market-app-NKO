package com.tecdesoftware.market_app.persistence;

import com.tecdesoftware.market_app.persistence.crud.ProductoCrudRepository;
import com.tecdesoftware.market_app.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
//le dice a spring a spring que este archivo sse enlaza BD
@Repository

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    //Equivalente a poner SELECT * from productos
    public List<Producto> getAll() {
        productoCrudRepository.findAll();
        //se castea de iterable a lista
        return (List<Producto>) productoCrudRepository.findAll();

    }
    public List<Producto> getByCategoria(int idcategoria) {
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idcategoria);
    }
    public Optional<List<Producto>> getEscasos(int cantidad){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad, true);
    }
    //obtener un producto dado el id
    public Optional<Producto> getProducto(int idProducto) {
            return productoCrudRepository.findById(idProducto);
    }

    //guardar un producto

    public Producto save(Producto producto) {
        return productoCrudRepository.save(producto);
    }

    //eliminar producto por id
    public void delete(int idProducto) {
        productoCrudRepository.deleteById(idProducto);
    }
}
