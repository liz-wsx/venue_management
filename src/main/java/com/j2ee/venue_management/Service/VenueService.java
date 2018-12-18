package com.j2ee.venue_management.Service;

import com.j2ee.venue_management.DO.Venue;

public interface VenueService {

    Venue findOne(Integer id);

    Venue createVenue(Venue venue);

    void deleteVenueById(Integer id);
}
