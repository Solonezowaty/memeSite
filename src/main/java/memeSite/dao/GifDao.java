package memeSite.dao;

import memeSite.model.Gif;
import java.util.List;

public interface GifDao {
    List<Gif> findAll();
    List<Gif> findFavorites();
    List<Gif> findByCategoryId(int id);
    Gif findOne(String name);
    List<Gif> findGifById();

}
