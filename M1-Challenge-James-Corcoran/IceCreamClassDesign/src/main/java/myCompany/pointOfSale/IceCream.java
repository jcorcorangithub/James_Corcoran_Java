package myCompany.pointOfSale;

import java.util.Objects;

public class IceCream {
    private String flavor;
    private int numOfScoops;
    private int costPerScoop;
    public boolean hasSprinkles = false;

    public IceCream(String flavor, int numOfScoops, int costPerScoop) {
        this.flavor = flavor;
        this.numOfScoops = numOfScoops;
        this.costPerScoop = costPerScoop;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getNumOfScoops() {
        return numOfScoops;
    }

    public void setNumOfScoops(int numOfScoops) {
        this.numOfScoops = numOfScoops;
    }

    public double getCostPerScoop() {
        return costPerScoop;
    }

    public void setCostPerScoop(int costPerScoop) {
        this.costPerScoop = costPerScoop;
    }

    //the above methods are getters and setters
    //the below methods are the ones I added
    public void addSprinkles(){
        this.hasSprinkles = true;
    }

    public Object cupOrCone(String container){
        return "I would like a "+container;
    }

    public int finalCost(){
        return this.costPerScoop * this.numOfScoops;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return numOfScoops == iceCream.numOfScoops && Double.compare(iceCream.costPerScoop, costPerScoop) == 0 && Objects.equals(flavor, iceCream.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, numOfScoops, costPerScoop);
    }
}
