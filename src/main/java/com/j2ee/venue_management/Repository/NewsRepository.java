package com.j2ee.venue_management.Repository;

import com.j2ee.venue_management.DO.News;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @param: none
 * @description: 对数据库中News表进行操作
 * @author: YQ
 * @create: 2018-12-9
 **/
public interface NewsRepository extends JpaRepository<News, Integer> {
}
