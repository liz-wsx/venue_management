package com.j2ee.venue_management.Controller;

import com.j2ee.venue_management.DO.Admin;
import com.j2ee.venue_management.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//前后端交互
/**
 * @param: none
 * @description: admin controller
 * @author: KingJ
 * @create: 2018-11-28 00:54
 **/
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/signIn/{name}")
    public Admin signIn(@PathVariable("name") String name,
                        @RequestParam("password") String password) {
        return adminService.findByNameAndPassword(name, password);
    }

}
