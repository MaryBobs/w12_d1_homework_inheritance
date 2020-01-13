import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;


public class ManagerTest {

    private Manager manager;

    @Before
    public void before() {
        manager = new Manager("Phil", "GG679394T", 80000, "Technical");
    }

    @Test
    public void canGetName() {
        assertEquals("Phil", manager.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("GG679394T", manager.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(80000, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Technical", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1000);
        assertEquals(81000, manager.getSalary(), 0.01);
    }

    @Test
    public void cannotEnterANegativeValueToRaiseSalary() {
        manager.raiseSalary(-100);
        assertEquals(80000, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus() {
        assertEquals(800, manager.getBonus(), 0.01);
    }

}
