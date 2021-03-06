package com.j2ee.venue_management.Repository;

import com.j2ee.venue_management.DO.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.*;

import java.util.List;

/**
 * @param: none
 * @description: 对数据库中Booking表进行操作
 * @author: KingJ
 * @create: 2018-11-17 17:15
 **/
public interface BookingRepository extends JpaRepository<Booking, Integer> {

    Booking findByVenueidAndDate(Integer venueid, String date);
    List<Booking> findByUserid(Integer userid);
}
