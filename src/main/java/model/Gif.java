package model;

import memeSite.dao.GifDao;

import java.util.ArrayList;
import java.util.List;

public class Gif {

    private String name;
    private String username;

    public Gif(String name, String username) {
        this.name=name;
        this.username=username;
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

    public String getUrl(){
        return getName()+".gif";
    }
}
