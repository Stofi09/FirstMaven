package Employee;

import java.time.LocalDate;

public abstract class aEmployee {

    protected String name;
    protected LocalDate startOfEmployment;

    public aEmployee(String name, LocalDate date){
        this.name = name;
        this.startOfEmployment = date;
    }

    public String getName(){
        return this.name;
    }
    public LocalDate getStartOfEmployment(){
        return this.startOfEmployment;
    }
}
