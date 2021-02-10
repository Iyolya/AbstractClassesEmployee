import org.junit.Before;
import org.junit.Test;
import tech_staff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before (){
        developer = new Developer("Steve", "GR4234", 2000);
    }

    @Test
    public void getName(){
        assertEquals("Steve", developer.getName() );
    }

    @Test
    public void getNI(){
        assertEquals("GR4234", developer.getNI() );
    }

    @Test
    public void getSalary(){
        assertEquals(2000, developer.getSalary(),  0.01);
    }

    @Test
    public void raiseSalary(){
        developer.raiseSalary(400);
        assertEquals(2400, developer.getSalary(), 0.01);

    }

    @Test
    public void canPayBonus(){
        assertEquals(20, developer.payBonus(), 0.01);

    }

}
