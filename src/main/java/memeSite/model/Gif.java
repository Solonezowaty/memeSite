package memeSite.model;

public class Gif {

    private String name;
    private String username;
    private boolean favorites;


    public Gif(String name,String username,boolean favorites) {
        this.name = name;
        this.username = username;
        this.favorites = favorites;
    }

    public Gif(String name, String username) {
        this.name = name;
        this.username = username;
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
}