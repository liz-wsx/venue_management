package com.j2ee.venue_management.Controller;

import com.j2ee.venue_management.DO.Venue;
import com.j2ee.venue_management.Service.VenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//前后端交互
/**
 * @param: none
 * @description: Venue controller
 * @author: YQ
 * @create: 2018-12-9
 **/
@Controller
@RequestMapping("/venue")
public class VenueController {

    @Autowired
    private VenueService venueService;

    @GetMapping("/getinfo/{id}")
    public Venue VenueList(@PathVariable("id") Integer id){
        return venueService.findOne(id);
    }


}
