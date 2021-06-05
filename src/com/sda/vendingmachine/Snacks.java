package com.sda.vendingmachine;

public class Snacks extends Products {

    private String shapeOfPack;

    public Snacks(String name, double price, int code, String shapeOfPack) {
        super(name, price, code);
        this.shapeOfPack = shapeOfPack;
    }

    public String getShapeOfPack() {
        return shapeOfPack;
    }

    public void setShapeOfPack(String shapeOfPack) {
        this.shapeOfPack = shapeOfPack;
    }

    @Override
    public String toString() {
        return "Snacks{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", code=" + code +
                ", shapeOfPack='" + shapeOfPack + '\'' +
                '}';
    }


    //    @Override
//    public String toString() {
//        return "Snacks{" +
//                "name='" + super.getName() + '\'' +
//                ", price='" + super.getPrice() + '\'' +
//                ", code='" + super.getCode() + '\'' +
//                ", shapeOfPack=" + shapeOfPack +
//                '}';
//    }
//}
}