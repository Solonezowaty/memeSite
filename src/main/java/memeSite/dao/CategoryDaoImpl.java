package memeSite.dao;

import memeSite.model.Category;
import memeSite.model.Gif;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CategoryDaoImpl implements CategoryDao{

    GifDaoImpl gifDao = new GifDaoImpl();
    @Override
    public List<Category> category() {
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category("Funny",  1));
        categoryList.add(new Category("Android",2));
        categoryList.add(new Category("Programming",3));
        return categoryList;
    }

    @Override
    public Category findByCategoryId(int id) {
        return findAllCategory().stream().filter(c->c.getId()==id).collect(Collectors.toList()).get(0);
    }

    @Override
    public List<Category> findAllCategory() {
        List<Category> cat = new ArrayList<>();
        for(Category name:category()){
            cat.add(new Category(name.getName(),name.getId()));
        }
        return cat;
    }

    public List<Category> findCategoryById(int id){
        List<Category> cat = new ArrayList<>();
        for(Category name:category()){
            if(name.getId()==id)
            cat.add(new Category(name.getName(),name.getId()));
        }
        return cat;
    }


}
