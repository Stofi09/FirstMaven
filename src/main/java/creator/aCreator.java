package creator;

public abstract class aCreator {

    private String name;

    protected aCreator(String name){
        this.name = name;
    }
    protected aCreator() {

    }
    public String getName() {
        return name;
    }

}
