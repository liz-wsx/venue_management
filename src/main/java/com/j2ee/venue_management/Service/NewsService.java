package com.j2ee.venue_management.Service;

import com.j2ee.venue_management.DO.News;

public interface NewsService {

    News findOne(Integer id);

    News createNews(News news);

    void deleteNewsById(Integer id);
}
