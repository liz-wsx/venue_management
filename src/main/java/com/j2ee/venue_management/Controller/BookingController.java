package com.j2ee.venue_management.Controller;

import com.j2ee.venue_management.DO.Booking;
import com.j2ee.venue_management.DO.User;
import com.j2ee.venue_management.Service.BookingService;
import com.j2ee.venue_management.Service.UserService;
import com.j2ee.venue_management.Repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
//前后端交互
/**
 * @param: none
 * @description: booking controller
 * @author: KingJ
 * @create: 2018-11-28 00:54
 **/
@Controller
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @Autowired
    private UserService userService;

    @Autowired
    private BookingRepository bookingRepository;

    @GetMapping("/orderinfo")
    public String index3()
    {
        return "orderinfo";
    }

    @GetMapping("/getinfo/{id}")
    public Booking bookingList(@PathVariable("id") Integer id){
        return bookingService.findOne(id);
    }


    @GetMapping("/getOrder")
    public String getOrder(Model model)
    {
        List<Booking> bookingList=bookingRepository.findAll();
        model.addAttribute("bookingList", bookingList);
        return "orderinfo";
    }

    @GetMapping("/cancel")
    public String cancelOrder(@RequestParam("id") Integer id,
                              @RequestParam("userid") Integer userid,
                              Model model)
    {
        bookingService.deleteBookingById(id);
        User user=userService.findOne(userid);
        List<Booking> bookingList=bookingService.findByUserid(userid);
        model.addAttribute("bookingList",bookingList);
        model.addAttribute("user",user);
        return "user-orders";
    }


}
