package com.j2ee.venue_management.Controller;

import com.j2ee.venue_management.DO.Booking;
import com.j2ee.venue_management.DO.News;
import com.j2ee.venue_management.DO.User;
import com.j2ee.venue_management.Service.UserService;
import com.j2ee.venue_management.Service.BookingService;
import com.j2ee.venue_management.Repository.UserRepository;
import com.j2ee.venue_management.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
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


    @Autowired
    private NewsService newsService;

    @Autowired
    private BookingService bookingService;


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
        Integer a=1;
        News news1= newsService.findNews(a++);
        News news2= newsService.findNews(a++);
        News news3= newsService.findNews(a++);
        News news4= newsService.findNews(a++);
        model.addAttribute("user", user);
        model.addAttribute("news1",news1);
        model.addAttribute("news2",news2);
        model.addAttribute("news3",news3);
        model.addAttribute("news4",news4);
        return "index";
    }


    @GetMapping("/createU")
    public String createU(@RequestParam("name") String name,
                          @RequestParam("password") String password,
                          @RequestParam("phone") String phone,
                          @RequestParam("email") String email,
                          Model model)
    {
        User user = new User(name,password,phone,email);
        model.addAttribute("user", user);
        userRepository.save(user);
        return "index";
    }

    @GetMapping("/userMain")
    public String userMain(@RequestParam("id") Integer id,Model model)
    {
        User user=userService.findOne(id);
        model.addAttribute("user",user);
        return "user-ProEdit";
    }

    @GetMapping("/pwChange")
    public String pwChange(@RequestParam("id") Integer id,Model model)
    {
        User user=userService.findOne(id);
        model.addAttribute("user",user);
        return "user-PwChange";
    }

    @GetMapping("/userOrder")
    public String userOrder(@RequestParam("id") Integer id,Model model)
    {
        User user=userService.findOne(id);
        List<Booking> bookingList=bookingService.findByUserid(id);
        model.addAttribute("bookingList",bookingList);
        model.addAttribute("user",user);
        return "user-orders";
    }

    @GetMapping("/editInfo")
    public String editInfo(@RequestParam("id") Integer id,
                           @RequestParam("name") String name,
                           @RequestParam("phone") String phone,
                           @RequestParam("email") String email,
                           Model model)
    {
        User user=userService.findOne(id);
        user.setName(name);
        user.setEmail(email);
        user.setPhone(phone);
        User save = userRepository.save(user);
        model.addAttribute("user",user);
        return "user-ProEdit";
    }

    @GetMapping("/changePw")
    public String changePw(@RequestParam("id") Integer id,
                           @RequestParam("password") String password,
                           @RequestParam("newpw") String newpw,
                           @RequestParam("newpw2") String newpw2,
                           Model model)
    {
        User user=userService.findByIdAndPassword(id,password);
        user.setPassword(newpw);
        User save = userRepository.save(user);
        model.addAttribute("user",user);
        return "user-PwChange";
    }

}