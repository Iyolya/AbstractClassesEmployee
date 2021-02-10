import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before (){
        manager = new Manager("Jeff Bezos", "EO5637", 10203937478495944895774.43, "HR");
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
}


