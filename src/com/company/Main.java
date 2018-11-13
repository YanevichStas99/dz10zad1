package com.company;

public class Main {

    public static void main(String[] args) {
        Fruit redApple = new Fruit(FruitType.APPLE, Color.RED, 0.146, 10.49);
        System.out.println("red apple: " + redApple);


        Fruit greenApple = new Fruit(FruitType.APPLE,Color.GREEN,0.240,11.99);
        System.out.println("green apple: "+greenApple);

        Fruit lemon = new Fruit();
        lemon.setType(FruitType.LEMON);
        lemon.setColor(Color.YELLOW);
        lemon.setWeight(0.124);
        lemon.setPriceKg(31.99);
        System.out.println("lemon: "+lemon);
        Fruit banana=new Fruit();
        banana.setType(FruitType.BANANA);
        banana.setColor(Color.YELLOW);
        banana.setWeight(0.152);
        banana.setPriceKg(18.99);
        System.out.println("banana: "+banana);
        System.out.println("Check:");
        System.out.println("red apple price: "+String.format("%.2f",redApple.price()));
        System.out.println("green apple price: "+String.format("%.2f",greenApple.price()));
        System.out.println("lemon price: "+String.format("%.2f",lemon.price()));
        System.out.println("banana price: "+String.format("%.2f",banana.price()));
        double total=redApple.price()+greenApple.price()+lemon.price()+banana.price();
        System.out.println("-------------");
        System.out.println("in total: "+String.format("%.2f", total));

    }
}
