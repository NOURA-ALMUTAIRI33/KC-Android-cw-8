package com.example.cw7;

import java.io.Serializable;

public class Items  implements Serializable {


    private String itemName;
    private double itemprice;
    private int itemImage;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemprice() {
        return itemprice;
    }

    public void setItemprice(double itemprice) {
        this.itemprice = itemprice;
    }

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }

    public Items(String itemName, double itemprice, int itemImage) {
        this.itemName = itemName;
        this.itemprice = itemprice;
        this.itemImage = itemImage;
    }
}


