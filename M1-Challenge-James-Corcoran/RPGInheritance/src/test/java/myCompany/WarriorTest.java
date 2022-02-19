package myCompany;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WarriorTest {
    Warrior warrior;
    Constable constable;

    @Before
    public void setUp() {
        Warrior warrior = new Warrior("name");
        Constable constable = new Constable("name", "New York");
    }

    @Test
    public void shouldArrest() {
        constable.arrest(warrior);
        assertTrue(warrior.getArrestStatus());
    }
    @Test
    public void shouldLowerHealth() {
        constable.attack(warrior);
        assertEquals(95, warrior.getHealth());
    }
    @Test
    public void shouldIncreaseStamina() {
        warrior.increaseStamina(10);
        assertEquals( 110, warrior.getStamina());
    }
}
