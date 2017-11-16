package memeSite.controller;

import memeSite.dao.CategoryDaoImpl;
import memeSite.dao.GifDaoImpl;
import memeSite.model.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Controller
public class GifController {
   // @Autowired
    GifDaoImpl gifDao = new GifDaoImpl();
    CategoryDaoImpl categoryDao = new CategoryDaoImpl();

    private static List<Gif> names = new ArrayList<>();

    static {
        names.add(new Gif("android-explosion",false,1));
        names.add(new Gif("ben-and-mike",true,3));
        names.add(new Gif("book-dominos",false,2));
        names.add(new Gif("compiler-bot",true,1));
        names.add(new Gif("cowboy-coder",false,2));
        names.add(new Gif("infinite-andrew",true,3));
    }

    @GetMapping("/")
    public String home( ModelMap modelMap){
        modelMap.put("gifs", gifDao.findAll());
        return "home";
    }

    @GetMapping("/favorites")
    public String favorites(ModelMap modelMap){
        modelMap.put("fav",gifDao.findFavorites());

        return "favorites";
    }

    @GetMapping("/gif/{name}")
    public String details(@PathVariable String name, ModelMap modelMap){
        modelMap.addAttribute("gif",gifDao.findOne(name));
        return "gif-details";
    }

    @GetMapping("/categories")
    public String categories(ModelMap modelMap){
        modelMap.put("categories", categoryDao.category());
        return "categories";
    }

    @GetMapping("/category/{id}")
    public String categoryDetails(@PathVariable int id, ModelMap modelMap){
        // gifs
        modelMap.put("gifs",gifDao.findGifById(id));


        modelMap.put("category",categoryDao.findCategoryById(id));

        // category
        return "category";
    }

    @GetMapping("/search")
    public String search(@RequestParam String q, ModelMap modelMap){
        if(gifDao.findAll().stream().anyMatch(g->g.getName().equals(q))){
            modelMap.addAttribute("gif",gifDao.findOne(q));
            System.out.println("dupa1111"+gifDao.findOne(q));
            return "gif-details";
        }

        else if(categoryDao.findAllCategory().stream().anyMatch(c->c.getName().equals(q))){
            modelMap.put("gifs",gifDao.findGifByName(q));
            modelMap.put("category",categoryDao.findCategoryByName(q));
            return "category";
        }

        return "home";
    }

}
