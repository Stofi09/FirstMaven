package enums;

public enum Genre {
    CARTOON("Cartoon"),FICTION("Fiction"),NONFICTION("Non Fiction"),SCIENCE("Science"),POETRY("Poetry"),BIOGRAPHY("Biography");

    String name;
    Genre(String name){
        this.name = name;
    }
}
