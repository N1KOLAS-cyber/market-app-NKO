package com.tecdesoftware.market_app.persistence.entity;

import jakarta.persistence.*;

@Entity
public class Categoria {
    @Table(name="categorias")
    public class Categoria() {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_categoria")
        private Integer idCategoria;

        private String descripcion;
        public Boolean estado;

        public Integer getIdCategoria() {}

    }
}
