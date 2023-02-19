package com.wordpress.faeldi.cartnotification;

import java.util.List;

public class Sale {
    private String clientName;
    private List<Integer> productsId;

    public Sale(String clientName, List<Integer> productsId) {
        this.clientName = clientName;
        this.productsId = productsId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public List<Integer> getProductsId() {
        return productsId;
    }

    public void setProductsId(List<Integer> productsId) {
        this.productsId = productsId;
    }
}
