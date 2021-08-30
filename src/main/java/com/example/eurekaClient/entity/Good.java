package com.example.eurekaClient.entity;

public class Good {
    private Integer goodID;
    private String goodType;
    private String goodName;
    private String designStyle;
    private Integer inventory;
    private Double price;

    public Integer getGoodID() {
        return goodID;
    }

    public void setGoodID(Integer goodID) {
        this.goodID = goodID;
    }

    public String getGoodType() {
        return goodType;
    }

    public void setGoodType(String goodType) {
        this.goodType = goodType;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getDesignStyle() {
        return designStyle;
    }

    public void setDesignStyle(String designStyle) {
        this.designStyle = designStyle;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Good{" +
                "goodID=" + goodID +
                ", goodType='" + goodType + '\'' +
                ", goodName='" + goodName + '\'' +
                ", designStyle='" + designStyle + '\'' +
                ", inventory=" + inventory +
                ", price=" + price +
                '}';
    }
}
