package memeSite.dao;



import memeSite.model.Gif;

import java.util.HashSet;
import java.util.List;

public interface GifDao {
    List<Gif> findAll();
    List<Gif> findFavorites();

    Gif findOne(String name);
    HashSet<Gif> findCategory();

}
