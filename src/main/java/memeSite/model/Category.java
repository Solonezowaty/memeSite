package memeSite.model;

public class Category {

    private String name;
    private Integer id;

    public Category(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public Category(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
