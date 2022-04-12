package com.company;

public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 휘핑";
    }

    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL) {
            cost += 0.11;
        } else if(beverage.getSize() == Size.GRANDE){
            cost += 0.12;
        } else if(beverage.getSize() == Size.VENTI){
            cost += 0.15;
        }
        return cost;
    }
}
