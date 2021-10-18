package employee;

import java.time.LocalDate;

public class Manager extends AEmployee implements IManager {

    public Manager(String name, LocalDate date) {
        super(name, date);
    }

    @Override
    public boolean removeCustomer() {
        return false;
    }
}
