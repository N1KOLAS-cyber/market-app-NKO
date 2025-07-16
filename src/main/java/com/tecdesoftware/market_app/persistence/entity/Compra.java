package com.tecdesoftware.market_app.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="compras")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_compra")
    //le cambié de int a integer TODO
    private Integer idCompra;

    @Column(name="id_cliente")
    private String idCliente;

    //LocalDateTime
    private LocalDate fecha;

    @Column(name="medio_pago")
    private String medioPago;

    private String comentario;

    private Boolean estado;
    // Relación con cliente: muchas compras para un cliente
    @ManyToOne
    //insertable y updateble en false es para que no haya modificaciones
    @JoinColumn(name="id_cliente", insertable=false, updatable=false)
    private Cliente cliente;

    //una compra tiene muchos productos
    @OneToMany(mappedBy = "compra", cascade = CascadeType.ALL)
    private List<CompraProducto> productos;


    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<CompraProducto> getProductos() {
        return productos;
    }

    public void setProductos(List<CompraProducto> productos) {
        this.productos = productos;
    }
}
