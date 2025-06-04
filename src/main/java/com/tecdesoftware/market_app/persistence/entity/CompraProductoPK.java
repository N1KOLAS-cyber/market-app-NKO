package com.tecdesoftware.market_app.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

//para unir la dos llaves y crear una llave compuesta

@Embeddable
public class CompraProductoPK implements Serializable {

        @Column(name = "id_compra")
        private int idCompra;

        @Column (name = "id_producto")
        private int idProducto;

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
}


