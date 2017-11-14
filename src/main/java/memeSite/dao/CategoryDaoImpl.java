package memeSite.dao;

import memeSite.model.Category;
import memeSite.model.Gif;

import java.util.ArrayList;
import java.util.List;

public class CategoryDaoImpl implements CategoryDao{

    @Override
    public List<Category> category() {
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category("Funny",  1));
        categoryList.add(new Category("Android",2));
        categoryList.add(new Category("Programming",3));
        return categoryList;
    }
}
