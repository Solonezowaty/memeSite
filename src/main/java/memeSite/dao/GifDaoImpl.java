package memeSite.dao;


import memeSite.model.Gif;

import java.util.*;
import java.util.stream.Collectors;

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

    @Override
    public List<Gif> findFavorites() {
        List<Gif> gifs = new ArrayList<>();
        Random rand = new Random();
        int i =0;
        for (String name:names) {
            boolean result = rand.nextBoolean();
            if(result){
                gifs.add(new Gif(name, "username"+i++));
            }
        }
        return gifs;
    }

    public Gif findOne(String name){
        return findAll().stream().filter(a->a.getName().equals(name)).collect(Collectors.toList()).get(0);
    }

}
