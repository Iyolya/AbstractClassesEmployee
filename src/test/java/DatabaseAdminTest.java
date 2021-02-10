import org.junit.Before;
import org.junit.Test;
import tech_staff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Billy", "E45118", 26000.00);
    }

    @Test
    public void getName(){
        assertEquals("Billy", databaseAdmin.getName());
    }
    @Test
    public void getNI(){
        assertEquals("E45118", databaseAdmin.getNI());
    }
    @Test
    public void getSalary(){
        assertEquals(26000.00, databaseAdmin.getSalary(), 0.01);
    }
    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(1000.00);
        assertEquals(27000.00, databaseAdmin.getSalary(), 0.01);
    }
    @Test
    public void canPayBonus(){
        assertEquals(260, databaseAdmin.payBonus(), 0.01);
    }


}
