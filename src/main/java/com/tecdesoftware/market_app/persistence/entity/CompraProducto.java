package com.tecdesoftware.market_app.persistence.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
public class CompraProducto {

    @Table(name = "compras_productos")
    public class compraProducto{

        //ID pendiente
        @EmbeddedId
        private CompraProductoPK id;

        private Integer cantidad;
        private Double total;
        private Boolean estado;

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

        public void setEstado(Boolean estado) {
            this.estado = estado;
        }
    }

}
