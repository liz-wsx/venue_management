package com.j2ee.venue_management.Service;

import com.j2ee.venue_management.DO.Booking;

import java.sql.Timestamp;
import java.util.*;

public interface BookingService {

    Booking findOne(Integer id);

    Booking findByVenueidAndDate(Integer Venueid, String date);

    List<Booking> findByUserid(Integer userid);

    Booking createBooking(Booking booking);

    void deleteBookingById(Integer id);
}
