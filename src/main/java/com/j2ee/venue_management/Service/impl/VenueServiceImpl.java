package com.j2ee.venue_management.Service.impl;

import com.j2ee.venue_management.DO.Venue;
import com.j2ee.venue_management.Repository.VenueRepository;
import com.j2ee.venue_management.Service.VenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @param: none
 * @description: 用于实现Service层
 * @author: YQ
 * @create: 2018-12-9
 **/
@Service
public class VenueServiceImpl implements VenueService {

    @Autowired
    private VenueRepository VenueRepository;

    @Override
    public Venue findOne(Integer id){return VenueRepository.findById(id).get();};

    @Override
    public Venue createVenue(Venue venue){
        return VenueRepository.save(venue);
    }

    @Override
    public void deleteVenueById(Integer id){
        VenueRepository.deleteById(id);
    }

}
