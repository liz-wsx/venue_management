package com.j2ee.venue_management.Repository;

import com.j2ee.venue_management.DO.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @param: none
 * @description: 对数据库中Message表进行操作
 * @author: YQ
 * @create: 2018-12-9
 **/
public interface MessageRepository extends JpaRepository<Message, Integer> {
}
