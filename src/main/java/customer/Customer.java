package customer;

import enums.CustomerAgeType;
import item.Item;
import library.Library;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private Enum<CustomerAgeType> ageType;
    private List<Item> currentItems;
    private List<Library> libraries;

    public Customer(String name, Enum ageType){
        this.name = name;
        this.ageType = ageType;
        this.currentItems = new ArrayList<>();
        this.libraries = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }
    public Enum getAgeType(){
        return this.ageType;
    }

    public void addItem(Item item){
        this.currentItems.add(item);
    }
    public List<Item> getItems(){
        return this.currentItems;
    }
    public void addLibrary(Library lib){
        this.libraries.add(lib);
    }
    public List<Library> getLibraries (){
        return this.libraries;
    }

    public boolean removeItem(Item item){
        if (checkItem(item)){
            this.currentItems.remove(item);
            return true;
        }else{
            System.out.println("The customer doesn't have that item " + item);
            return false;
        }
    }

    private boolean checkItem(Item item){
        return (this.currentItems.contains(item)) ? true : false;
    }

    public boolean removeLibrary(Library lib){
        if (checkLibrary(lib)){
            this.libraries.remove(lib);
            return true;
        }else{
            System.out.println("The customer doesn't have that library " + lib);
            return false;
        }
    }

    private boolean checkLibrary(Library lib){
        return (this.libraries.contains(lib)) ? true : false;
    }


}
