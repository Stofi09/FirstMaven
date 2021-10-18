package enums;

public enum CustomerAgeType {
    UNDERAGE("Under age"),ADULT("Adult");
    String name;
    CustomerAgeType(String name){
        this.name = name;
    }
}
