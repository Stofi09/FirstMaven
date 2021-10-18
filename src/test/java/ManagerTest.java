import employee.Manager;
import employee.IManager;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    @Test
    public void managerRemove(){
        IManager mgr = new Manager("name", LocalDate.now());
        assertEquals("cant remove", false,mgr.removeCustomer());
    }
}
