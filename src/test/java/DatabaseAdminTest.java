import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Ed", "HJ9374925T", 45000);
    }

    @Test
    public void canGetName() {
        assertEquals("Ed", databaseAdmin.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("HJ9374925T", databaseAdmin.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(45000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(1000);
        assertEquals(46000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void cannotEnterANegativeValueToRaiseSalary() {
        databaseAdmin.raiseSalary(-100);
        assertEquals(45000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus() {
        assertEquals(450, databaseAdmin.getBonus(), 0.01);
    }
}
