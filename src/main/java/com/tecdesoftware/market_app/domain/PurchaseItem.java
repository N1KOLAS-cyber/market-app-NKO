package com.tecdesoftware.market_app.domain;

public class PurchaseItem {
    private int productid;
    private int quantity;
    private double Double;
    private boolean active;

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getDouble() {
        return Double;
    }

    public void setDouble(double aDouble) {
        Double = aDouble;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
