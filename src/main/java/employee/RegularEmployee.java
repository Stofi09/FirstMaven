package employee;

import java.time.LocalDate;

public class RegularEmployee extends AEmployee implements IRegularEmployee {

    public RegularEmployee(String name, LocalDate date) {
        super(name, date);
    }
}
