package com.j2ee.venue_management.Service;

import com.j2ee.venue_management.DO.Booking;
import java.util.*;

public interface BookingService {

    Booking findOne(Integer id);

    Booking findByVenueIDAndDate(Integer VenueID, Date date);

    Booking findByUserIDAndUserName(Integer UserID, String UserName);

    Booking findByVenueNameAndVenueID(String VenueName,Integer VenueID);

    Booking createBooking(Booking booking);

    void deleteBookingById(Integer id);
}
