package memeSite.dao;

import memeSite.model.Category;

import java.util.List;

public interface CategoryDao {
    List<Category> category();
    Category findByCategoryId(int id);
    List<Category> findAllCategory();
}
