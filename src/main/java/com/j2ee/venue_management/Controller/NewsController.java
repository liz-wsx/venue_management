package com.j2ee.venue_management.Controller;

import com.j2ee.venue_management.DO.News;
import com.j2ee.venue_management.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//前后端交互
/**
 * @param: none
 * @description: News controller
 * @author: YQ
 * @create: 2018-12-9
 **/
@Controller
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping("/getinfo/{id}")
    public News NewsList(@PathVariable("id") Integer id){
        return newsService.findOne(id);
    }


}
