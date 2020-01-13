import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before () {
        director = new Director("Mike", "LK0897486B", 100000, "Head Office", 2000000000);
    }

    @Test
    public void canGetName() {
        assertEquals("Mike", director.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("LK0897486B", director.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(100000, director.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Head Office", director.getDeptName());
    }

    @Test
    public void canGetBudget() {
        assertEquals(2000000000, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(1000);
        assertEquals(101000, director.getSalary(), 0.01);
    }

    @Test
    public void cannotEnterANegativeValueToRaiseSalary() {
        director.raiseSalary(-100);
        assertEquals(100000, director.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus() {
        assertEquals(1000, director.getBonus(), 0.01);
    }
}
