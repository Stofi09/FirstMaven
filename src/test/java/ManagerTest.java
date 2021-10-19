import employee.Manager;
import employee.IManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
public class ManagerTest {

    @Test
    public void managerRemove(){
        IManager mgr = new Manager("name", LocalDate.now());
        assertEquals( false,mgr.removeCustomer(),"Customer was removed");
    }
}
