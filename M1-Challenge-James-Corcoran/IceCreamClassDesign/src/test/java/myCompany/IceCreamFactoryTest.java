package myCompany;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamFactoryTest {
    myCompany.factory.IceCream iceCream;

    @Before
    public void setUp() {
        iceCream = new myCompany.factory.IceCream("vanilla", 3.33,40);
    }


    @Test
    public void shouldProduceMore(){
        iceCream.produceMore();
        assertEquals( 15, iceCream.quantityLeft);
    }

    @Test
    public void addNewFlavor(){
        assertEquals("research new flavor: hazelnut", iceCream.addNewFlavor("hazelnut"));
    }
}
