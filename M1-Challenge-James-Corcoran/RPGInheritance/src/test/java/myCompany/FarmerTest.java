package myCompany;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FarmerTest {
    Farmer farmer = new Farmer("name",false, false);

    @Test
    public void testFarmer() {
        farmer.startPlowing();
        assertTrue(farmer.isPlowing());

        farmer.startHarvesting();
        assertTrue(farmer.isHarvesting());

    }
}
