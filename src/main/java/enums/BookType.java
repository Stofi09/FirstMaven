package enums;

public enum BookType {
    FICTION("Fiction"),NONFICTION("Non Fiction"),SCIENCE("Science"),POETRY("Poetry"),BIOGRAPHY("Biography");

    String name;
    BookType(String name){
        this.name = name;
    }
}
