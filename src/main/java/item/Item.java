package item;

import enums.BookType;
import enums.MovieType;

import java.time.LocalDate;

public abstract class Item {

    protected String title;
    protected Enum<?> type;
    protected LocalDate timeTakenOut;
    protected boolean isAvailable;

    protected Item() {}


    public void borrowItem(){
        this.setUnAvailable();
        this.setTime(LocalDate.now());
    }

    public String getTitle() {
        return title;
    }
    public Enum getType() {
        return type;
    }
    public LocalDate getTime() {
        return timeTakenOut;
    }
    private void setTime(LocalDate time) {
        this.timeTakenOut = time;
    }
    protected void setUnAvailable(){
        this.isAvailable = false;
    }
    public void setAvailable(){
        this.isAvailable = true;
    }
    public boolean getAvailability(){
        return  this.isAvailable;
    }
}
