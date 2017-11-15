package memeSite.dao;

import memeSite.model.Category;

import java.util.List;

public interface CategoryDao {
    List<Category> category();
    Category findCategoryById(int id);
    List<Category> findAllCategory();
    Category findCategoryByName(String name);


}
