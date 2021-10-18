import employee.RegularEmployee;
import employee.aEmployee;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    @Test
    public void testName(){
        aEmployee emp = new RegularEmployee("name", LocalDate.now());
        assertEquals("that is not the name", "name", emp.getName());
    }

    @Test
    public void testEmploymentDate(){
        aEmployee emp = new RegularEmployee("name", LocalDate.now());
        assertEquals("that is not the date", LocalDate.now(), emp.getStartOfEmployment());
    }
}
