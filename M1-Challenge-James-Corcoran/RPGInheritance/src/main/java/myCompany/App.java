package myCompany;

public class App {
    public static void main(String[] args) {
        Constable constable1 = new Constable("James", "ny");
        Farmer farmer1 = new Farmer("Tim", true, false);

        System.out.println(farmer1.getArrestStatus());
        constable1.arrest(farmer1);
        System.out.println(farmer1.getArrestStatus());
    }
}
