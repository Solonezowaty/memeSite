package memeSite.model;

public class Category {

    private String name;
    private int id;

    public Category(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getCategory() {
        return name;
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
