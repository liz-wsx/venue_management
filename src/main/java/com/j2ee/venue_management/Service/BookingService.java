package com.j2ee.venue_management.Service;

import com.j2ee.venue_management.DO.Booking;
import java.util.*;

public interface BookingService {

    Booking findOne(Integer id);

    Booking findByVenueidAndDate(Integer Venueid, Date date);

    Booking findByUseridAndUsername(Integer userid, String username);

    Booking findByVenuenameAndVenueid(String venuename,Integer venueid);

    Booking createBooking(Booking booking);

    void deleteBookingById(Integer id);
}
