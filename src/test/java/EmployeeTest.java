import employee.RegularEmployee;
import employee.AEmployee;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;


public class EmployeeTest {

    @Test
    public void testName(){
        AEmployee emp = new RegularEmployee("name", LocalDate.now());
        assertEquals( "name", emp.getName());
    }

    @Test
    public void testEmploymentDate(){
        AEmployee emp = new RegularEmployee("name", LocalDate.now());
        assertEquals( LocalDate.now(), emp.getStartOfEmployment());
    }
}
