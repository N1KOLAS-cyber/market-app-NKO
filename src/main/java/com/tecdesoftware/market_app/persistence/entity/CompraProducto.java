package com.tecdesoftware.market_app.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "compras_productos")
public class CompraProducto {

        //ID pendiente
        @EmbeddedId
        private CompraProductoPK id;

        private Integer cantidad;
        private Double total;
        private Boolean estado;

        //saber todo los productos que ahi en una compra
        //unir la tabla compras

        @ManyToOne
        @JoinColumn(name = "id_compra", insertable = false, updatable = false)
        private Compra compra;

        @ManyToOne
        @MapsId("idCompra")
        @JoinColumn(name = "id_producto", insertable = false, updatable = false)
        private Producto Producto;

        public CompraProductoPK getId() {
            return id;
        }

        public void setId(CompraProductoPK id) {
            this.id = id;
        }

        public Integer getCantidad() {
            return cantidad;
        }

        public void setCantidad(Integer cantidad) {
            this.cantidad = cantidad;
        }

        public Double getTotal() {
            return total;
        }

        public void setTotal(Double total) {
            this.total = total;
        }

        public Boolean getEstado() {
            return estado;
        }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Producto getProducto() {
        return Producto;
    }

    public void setProducto(Producto producto) {
        Producto = producto;
    }
}

