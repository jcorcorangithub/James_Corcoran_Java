package myCompany;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calc = new Calculator();

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void testAdd(){
        assertEquals(2, calc.add(1,1));
        assertEquals(2.2, calc.add(1.1,1.1), 0.001);
        assertEquals(-5, calc.add(-1,-4));
    }

    @Test
    public void testSubtract(){
        assertEquals(0, calc.subtract(1,1));
        assertEquals(-2.0, calc.subtract(1.1,3.1),0.001);
    }

    @Test
    public void testMultiply(){
        assertEquals(9, calc.multiply(3,3));
        assertEquals(1.21, calc.multiply(1.1,1.1),0.001);
        assertEquals(6, calc.multiply(-2,-3));
    }

    @Test
    public void testDivision(){
        assertEquals(3, calc.divide(6,2),0.001);
        assertEquals(2.5, calc.divide(5,2),0.001);
    }
}
