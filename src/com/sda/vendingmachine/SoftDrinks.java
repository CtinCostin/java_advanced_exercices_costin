package com.sda.vendingmachine;

public class SoftDrinks extends Products {

    private boolean isSour;

    public SoftDrinks(String name, double price, int code, boolean isSour) {
        super(name, price, code);
        this.isSour = isSour;
    }


    public void setSour(boolean sour) {
        isSour = sour;
    }

    public boolean isSour() {
        return isSour;
    }


    @Override
    public String toString() {
        return "SoftDrinks{" +
                "name='" + super.getName() + '\'' +
                ", price='" + super.getPrice() + '\'' +
                ", code='" + super.getCode() + '\'' +
                ", isSour=" + isSour +
                '}';
    }
}