package myCompany;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IceCreamPOSTest {
    myCompany.pointOfSale.IceCream iceCream;

    @Before
    public void setUp() {
        iceCream = new myCompany.pointOfSale.
                IceCream("Vanilla", 2, 5);
    }

    @Test
    public void addSprinkles(){
        iceCream.addSprinkles();
        assertTrue(iceCream.hasSprinkles);
    }

    @Test
    public void cupOrCone(){
        assertEquals("I would like a cup", iceCream.cupOrCone("cup"));
    }

    @Test
    public void finalCost(){
        assertEquals(10, iceCream.finalCost());
    }



}
