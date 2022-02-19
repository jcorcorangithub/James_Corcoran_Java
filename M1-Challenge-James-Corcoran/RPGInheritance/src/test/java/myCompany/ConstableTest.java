package myCompany;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstableTest {
//    Farmer farmer;
//    Constable constable;
//
//    @Before
//    public void setUp() {
        Farmer farmer = new Farmer("jim", false,false);
        Constable constable = new Constable("name", "New York");
//    }
// ARRESt
// JURSIDTCTION

    @Test
    public void testAttack() {
        farmer.attack(constable);
        assertEquals(99, constable.getHealth());
    }
    @Test
    public void testJurisdiction() {
//        farmer.attack(constable);
        assertEquals("New York", constable.getJurisdiction());
    }
}
