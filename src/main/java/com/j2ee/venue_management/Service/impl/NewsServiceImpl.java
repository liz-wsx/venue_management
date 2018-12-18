package com.j2ee.venue_management.Service.impl;

import com.j2ee.venue_management.DO.News;
import com.j2ee.venue_management.Repository.NewsRepository;
import com.j2ee.venue_management.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @param: none
 * @description: 用于实现Service层
 * @author: YQ
 * @create: 2018-12-9
 **/
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsRepository NewsRepository;

    @Override
    public News findOne(Integer id){return NewsRepository.findById(id).get();};

    @Override
    public News createNews(News news){
        return NewsRepository.save(news);
    }

    @Override
    public void deleteNewsById(Integer id){
        NewsRepository.deleteById(id);
    }

}
