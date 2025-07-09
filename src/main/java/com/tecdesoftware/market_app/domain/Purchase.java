package com.tecdesoftware.market_app.domain;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.time.LocalDateTime;
import java.util.List;

public class Purchase {
    private int PurchaseId;
    private String clienteId;
    private LocalDateTime date;
    private String comment;
    private String state;
    private List<Purchase> item;

    public int getPurchaseId() {
        return PurchaseId;
    }

    public void setPurchaseId(int purchaseId) {
        PurchaseId = purchaseId;
    }

    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<Purchase> getItem() {
        return item;
    }

    public void setItem(List<Purchase> item) {
        this.item = item;
    }
}