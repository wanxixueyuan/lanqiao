package controller;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UserService;

/**
 * Created by wei62_000 on 2017/6/23.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userLogIn")
    public String logIn(String name, String password, ModelMap map){
        User user =  userService.selectUser(name,password);
        if(user!=null){
            map.addAttribute("user",user);
            return "index";
        } else     return "LogIn";
    }
}
