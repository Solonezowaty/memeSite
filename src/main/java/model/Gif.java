package model;

<<<<<<< HEAD
public class Gif{
    private String name;
    private String username;
    private boolean favourite;

    public Gif(String name, String username) {
        this.name = name;
        this.username = username;
=======
import memeSite.dao.GifDao;

import java.util.ArrayList;
import java.util.List;

public class Gif {

    String name;
    String username;

    public Gif(String name, String username) {
        this.name=name;
        this.username=username;
>>>>>>> 7ac1bece73cb00b702770ebc0ceb5c92170b91cd
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
<<<<<<< HEAD
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
=======
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUrl(){
        return getName()+".gif";
>>>>>>> 7ac1bece73cb00b702770ebc0ceb5c92170b91cd
    }
    // for (File file : files) {
      //  if (file.isFile()) {
       //     results.add(file.getName());
      //  }
   // }


}
