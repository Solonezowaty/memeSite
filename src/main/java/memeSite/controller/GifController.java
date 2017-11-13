package memeSite.controller;


import memeSite.dao.GifDaoImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class GifController {

    GifDaoImpl gifDao = new GifDaoImpl();


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
}
