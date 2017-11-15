package memeSite.dao;

import memeSite.model.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CategoryDaoImpl implements CategoryDao {

    GifDaoImpl gifDao = new GifDaoImpl();

    @Override
    public List<Category> category() {
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category("Funny", 1));
        categoryList.add(new Category("Android", 2));
        categoryList.add(new Category("Programming", 3));
        return categoryList;
    }

    @Override
    public Category findCategoryById(int id) {
        return findAllCategory().stream().filter(c -> c.getId() == id).collect(Collectors.toList()).get(0);
    }

    @Override
    public List<Category> findAllCategory() {
        List<Category> cat = new ArrayList<>();
        for (Category name : category()) {
            cat.add(new Category(name.getName(), name.getId()));
        }
        return cat;
    }

    @Override
    public Category findCategoryByName(String name) {
        return findAllCategory().stream().filter(c -> c.getName().equals(name)).collect(Collectors.toList()).get(0);
    }
    /*public List<Category> findCategoryByName(String name){
        List<Category> cat = new ArrayList<>();
        for(Category nameCat:category()){
            if(nameCat.getName()==name)
            cat.add(new Category(nameCat.getName(),nameCat.getId()));
        }
        return cat;
    }*/
}
