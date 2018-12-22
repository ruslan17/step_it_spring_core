package core.controller;

import core.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/users")
public class MvcController {

    @RequestMapping("/test")
    public ModelAndView test(ModelAndView modelAndView) {
        modelAndView.setViewName("test");
        modelAndView.getModel().put("title", "Hello, World!");

        return modelAndView;
    }

    @RequestMapping("/user")
    public String getUser(Model model) {
        User user = new User(1, "John", 25);
        model.addAttribute("user", user);
        return "user";
    }

    @RequestMapping
    public ModelAndView getUsers(ModelAndView modelAndView) {
        modelAndView.setViewName("users");

        List<User> users = Arrays.asList(new User(1, "Nigar", 18),
                new User(2, "Chingiz", 20));

        modelAndView.getModel().put("list", users);
        return modelAndView;
    }

}