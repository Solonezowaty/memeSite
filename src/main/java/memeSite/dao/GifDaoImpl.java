package memeSite.dao;


import memeSite.model.Gif;

import java.util.ArrayList;
import java.util.List;

public class GifDaoImpl implements GifDao {
    private static List<String> names = new ArrayList<>();

    static {
        names.add("android-explosion");
        names.add("ben-and-mike");
        names.add("book-dominos");
        names.add("compiler-bot");
        names.add("cowboy-coder");
        names.add("infinite-andrew");
    }

    public List<Gif> findAll() {
        List<Gif> gifs = new ArrayList<>();
        int i =1;
        for(String name:names){
            gifs.add(new Gif(name, "username"+i++));
        }
        return gifs;
    }
}
