package employee;

import java.time.LocalDate;

public abstract class AEmployee {

    protected String name;
    protected LocalDate startOfEmployment;

    protected AEmployee(String name, LocalDate date){
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
