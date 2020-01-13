import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before() {
        developer = new Developer("Bob", "KS904827Q", 37000);
    }

    @Test
    public void canGetName() {
        assertEquals("Bob", developer.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("KS904827Q", developer.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(37000, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(1000);
        assertEquals(38000, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus() {
        assertEquals(370, developer.getBonus(), 0.01);
    }

}
