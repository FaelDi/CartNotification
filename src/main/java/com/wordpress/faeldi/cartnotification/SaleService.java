package com.wordpress.faeldi.cartnotification;

import java.util.List;

public class SaleService {
    Database database = new Database();

    public void saveSale(String clientName, List<Integer> productsId, SaleNotification saleNotification){
        Sale sale = new Sale(clientName, productsId);
        database.setSales(sale);
        saleNotification.send(sale);
    }
}
