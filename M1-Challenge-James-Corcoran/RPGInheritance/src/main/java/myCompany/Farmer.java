package myCompany;

public class Farmer extends Character {

    private boolean plowing;
    private boolean harvesting;

    public Farmer(String name, boolean plowing, boolean harvesting) {
        super(name, 75, 100, 75, 10, 1, false, false);
        this.plowing = false;
        this.harvesting = false;
    }

    public boolean isPlowing(){
        return this.plowing;
    }
    public void startPlowing(){
        this.plowing = true;
    }
    public void stopPlowing(){
        this.plowing = false;
    }


    public boolean isHarvesting(){
        return this.harvesting;
    }
    public void startHarvesting(){
        this.harvesting = true;
    }
    public void stopHarvesting(){
        this.harvesting = false;
    }







}
