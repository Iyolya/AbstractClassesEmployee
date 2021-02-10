import management.Manager;
import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;
    Manager manager1;
    @Before
    public void before (){
        manager = new Manager("Jeff Bezos", "EO5637", 10203937478495944895774.43, "HR");
        manager1 = new Manager("Mr. Bean", "HO5637", 100, "HR");
    }

    @Test
    public void getName(){
        assertEquals("Jeff Bezos", manager.getName() );
    }

    @Test
    public void getNI(){
        assertEquals("EO5637", manager.getNI() );
    }

    @Test
    public void getSalary(){
        assertEquals(10203937478495944895774.43, manager.getSalary(),  0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("HR", manager.getDeptName());
    }

    @Test
    public void raiseSalary(){
        manager.raiseSalary(1.57);
        assertEquals(10203937478495944895776.00, manager.getSalary(), 0.01);

    }

    @Test
    public void canPayBonus(){
        assertEquals(1, manager1.payBonus(), 0.01);

    }


}


