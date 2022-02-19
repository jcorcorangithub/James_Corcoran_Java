package myCompany;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class ConverterTest {
    private ConverterIf converterIf;
    private ConverterSwitch converterSwitch;

    @Before
    public void setUp() {
        converterIf = new ConverterIf();
        converterSwitch = new ConverterSwitch();
    }

    @Test
    public void shouldPrintErrors(){
        assertEquals("error message", converterIf.convertDay(0));
        assertEquals("error message", converterIf.convertMonth(0));
        assertEquals("error message", converterSwitch.convertDay(0));
        assertEquals("error message", converterSwitch.convertMonth(0));
    };

    @Test
    public void shouldReturnDays() {
        assertEquals("Monday", converterIf.convertDay(2));
        assertEquals("Thursday", converterSwitch.convertDay(5));
    };

    @Test
    public void shouldReturnMonths() {
        assertEquals("August", converterSwitch.convertMonth(8));
        assertEquals("June", converterSwitch.convertMonth(6));
    };

}
