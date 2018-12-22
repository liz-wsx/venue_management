package com.j2ee.venue_management.Service.impl;

import com.j2ee.venue_management.DO.Booking;
import com.j2ee.venue_management.Repository.BookingRepository;
import com.j2ee.venue_management.Service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * @param: none
 * @description: 用于实现Service层
 * @author: KingJ
 * @create: 2018-11-23 20:52
 **/
@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public Booking findOne(Integer id){return bookingRepository.findById(id).get();};

    @Override
    public Booking findByVenueidAndDate(Integer venueid, String date)
    {
        return bookingRepository.findByVenueidAndDate(venueid, date);
    }

    @Override
    public List<Booking> findByUserid(Integer userid)
    {
        return bookingRepository.findByUserid(userid);
    }

    @Override
    public Booking createBooking(Booking booking){
        return bookingRepository.save(booking);
    }

    @Override
    public void deleteBookingById(Integer id){
        bookingRepository.deleteById(id);
    }

}
