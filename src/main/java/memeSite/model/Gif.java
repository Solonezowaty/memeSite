package memeSite.model;

import javax.persistence.Entity;

@Entity
public class Gif {

    private String name;
    private String username;
    private boolean favorites;
    private int id;


    public Gif(String name,String username,boolean favorites) {
        this.name = name;
        this.username = username;
        this.favorites = favorites;
    }

    public Gif(String name, String username) {
        this.name = name;
        this.username = username;
    }

    public Gif(String name, boolean favorites, int id) {
        this.name = name;
        this.favorites = favorites;
        this.id = id;
    }

    public Gif(int id) {
        this.id = id;
    }

    public Gif(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Gif(String name, int id, String username) {
        this.name = name;
        this.username = username;
        this.id = id;
    }

    public Gif(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isFavorites() {
        return favorites;
    }

    public void setFavorites(boolean favorites) {
        this.favorites = favorites;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUrl() {
        return getName() + ".gif";
    }

    @Override
    public String toString() {
        return "Gif{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", favorites=" + favorites +
                '}';
    }
}