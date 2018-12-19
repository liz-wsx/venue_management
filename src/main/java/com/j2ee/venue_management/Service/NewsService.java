package com.j2ee.venue_management.Service;

import com.j2ee.venue_management.DO.News;

import java.util.List;

public interface NewsService {

    News findOne(Integer id);

    News createNews(News news);

    News findNews(Integer status);

    void deleteNewsById(Integer id);
}
