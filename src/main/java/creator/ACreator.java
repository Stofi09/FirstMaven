package creator;

public abstract class ACreator {

    private String name;

    protected ACreator(String name){
        this.name = name;
    }
    protected ACreator() {

    }
    public String getName() {
        return name;
    }

}
