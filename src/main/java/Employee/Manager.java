package Employee;

import java.time.LocalDate;

public class Manager extends aEmployee implements iManager{

    public Manager(String name, LocalDate date) {
        super(name, date);
    }

    @Override
    public boolean removeCustomer() {
        return false;
    }
}
