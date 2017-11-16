package memeSite.controller;

import memeSite.model.Category;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CategoryController {

    public List<Category> category() {
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category("Funny", 1));
        categoryList.add(new Category("Android", 2));
        categoryList.add(new Category("Programming", 3));
        return categoryList;
    }
}
