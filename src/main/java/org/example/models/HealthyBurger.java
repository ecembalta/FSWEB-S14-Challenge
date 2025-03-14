package org.example.models;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        super.addHamburgerAddition1(name, price);
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        super.addHamburgerAddition2(name, price);
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        super.addHamburgerAddition3(name, price);
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        super.addHamburgerAddition4(name, price);
    }

    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }


    @Override
    public double itemizeHamburger() {
            double hamburgerPrice = super.itemizeHamburger();
            System.out.println(super.getName() + " hamburger on a " + super.getBreadRollType() + " roll with " + super.getMeat() + ", price is " + super.getPrice());

            if(healthyExtra1Name != null){
                hamburgerPrice += healthyExtra1Price;
                System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
            }

            if(healthyExtra2Name != null){
                hamburgerPrice += healthyExtra2Price;
                System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
            }

            super.setPrice(hamburgerPrice);
            System.out.println(hamburgerPrice);
            return hamburgerPrice;

    }
}
