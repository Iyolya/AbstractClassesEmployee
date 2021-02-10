import management.Director;
import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;
    Director director1;

    @Before
    public void before(){
        director = new Director("Andy Warhol", "UY5637", 40000000000000.00, "CEO", 60000000000000.00);
        director1 = new Director("Andy Warhol Jr.", "OY5637", 100, "CEO", 60000000000000.00);
    }

    @Test
    public void getName(){
        assertEquals("Andy Warhol", director.getName() );
    }

    @Test
    public void getNI(){
        assertEquals("UY5637", director.getNI() );
    }

    @Test
    public void getSalary(){
        assertEquals(40000000000000.00, director.getSalary(),  0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("CEO", director.getDeptName());
    }

    @Test
    public void raiseSalary(){
        director.raiseSalary(1.57);
        assertEquals(40000000000001.57, director.getSalary(), 0.01);

    }

    @Test
    public void canPayBonus(){
        assertEquals(2, director1.payBonus(), 0.01);

    }
    @Test
    public void hasBudget(){
        assertEquals(60000000000000.00, director.getBudget(), 0.01);
    }
    @Test
    public void nameCannotBeNull(){
        director.setName("");
        assertEquals("Andy Warhol", director.getName());
    }
}
