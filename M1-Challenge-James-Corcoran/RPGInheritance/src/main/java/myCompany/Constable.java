package myCompany;

public class Constable extends Character{
    private String jurisdiction;

    public Constable(String name, String jurisdiction) {
        super(name, 60, 100, 60, 20, 5, false, false);
        this.jurisdiction = jurisdiction;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

//    public Object setJurisdiction(String jurisdiction) {
//        this.jurisdiction = jurisdiction;
//        return null;
//    }

    public void arrest(Character enemy) {
        enemy.isArrested();
    }

}
