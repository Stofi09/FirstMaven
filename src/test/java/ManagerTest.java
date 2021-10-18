import employee.Manager;
import employee.iManager;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    @Test
    public void managerRemove(){
        iManager mgr = new Manager("name", LocalDate.now());
        assertEquals("cant remove", false,mgr.removeCustomer());
    }
}
