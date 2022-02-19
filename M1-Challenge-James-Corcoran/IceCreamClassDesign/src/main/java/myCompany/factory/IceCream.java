package myCompany.factory;

import java.util.Objects;

public class IceCream {
    private String flavor;
    private double salesPrice;
    private int productionTime;
    public int quantityLeft = 10;

    public IceCream(){};

    public IceCream(String flavor, double salesPrice, int productionTime) {
        this.flavor = flavor;
        this.salesPrice = salesPrice;
        this.productionTime = productionTime;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public int getProductionTime() {
        return productionTime;
    }

    public void setProductionTime() {this.productionTime = productionTime;}

    public void produceMore(){
        this.quantityLeft = this.quantityLeft + 5;
    }

    public Object addNewFlavor(String newFlavor){
        System.out.println("research new flavor: "+newFlavor);
        return "research new flavor: "+newFlavor;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return Double.compare(iceCream.salesPrice, salesPrice) == 0 && productionTime == iceCream.productionTime && Objects.equals(flavor, iceCream.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, salesPrice, productionTime);
    }
}
