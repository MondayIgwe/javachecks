package org.example.checks;

public class Box extends All {
    //Car car =  new Car();
    public static double cost = 2000.0;

    public double getCost() throws Exception {
        runData();
        return cost;
    }

    public void reduceCost() {
        cost = cost - 1000.0;
    }
    public  void accessCost() {
        System.out.println("Cost is: " + cost);
    }
}