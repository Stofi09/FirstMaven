package employee;

import java.time.LocalDate;

public class RegularEmployee extends aEmployee implements iRegularEmployee{

    public RegularEmployee(String name, LocalDate date) {
        super(name, date);
    }
}
