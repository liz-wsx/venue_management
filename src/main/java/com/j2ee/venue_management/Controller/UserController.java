package com.j2ee.venue_management.Controller;

import com.j2ee.venue_management.DO.User;
import com.j2ee.venue_management.Service.UserService;
import com.j2ee.venue_management.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
//前后端交互
/**
 * @param: none
 * @description: user controller
 * @author: KingJ
 * @create: 2018-11-28 00:54
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/login")
    public String index(){
        return "login";
    }


    @GetMapping("/register")
    public String index2(){
        return "register";
    }

    @GetMapping("/getinfo/{id}")
    public User userList(@PathVariable("id") Integer id){
        return userService.findOne(id);
    }

    @GetMapping("/signIn")
    public String signIn(@RequestParam("name") String name,
                         @RequestParam("password") String password,
                         Model model) {
        User user = userService.findByNameAndPassword(name, password);
        model.addAttribute("user", user);
        return "userinfo";//html
    }

    @GetMapping("/createU")
    public String createU(@RequestParam("name") String name,
                          @RequestParam("password") String password,
                          @RequestParam("phoneNumber") String phoneNumber,
                          @RequestParam("email") String email,
                          Model model)
    {
        User user = new User(name,password,phoneNumber,email);
        model.addAttribute("user", user);
        userRepository.save(user);
        return "userinfo";
    }

}