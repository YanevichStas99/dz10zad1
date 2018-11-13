package com.company;

public class Fruit {
    private FruitType type;
    private Color color;
    private double weight;
    private double priceKg;

    public void setType(FruitType type) {
        this.type = type;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPriceKg(double priceKg) {
        this.priceKg = priceKg;
    }
    public Fruit(){
    }
    public Fruit(FruitType type, Color color, double weight, double priceKg){
        this.type=type;
        this.color=color;
        this.weight=weight;
        this.priceKg=priceKg;
    }

    public double getWeight() {
        return weight;
    }

    public double getPriceKg() {
        return priceKg;
    }

    public double price() {
        return priceKg * weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "type=" + type +
                ", color=" + color +
                ", weight=" + weight +
                ", priceKg=" + priceKg +
                '}';
    }


}
