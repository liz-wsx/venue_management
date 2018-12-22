package com.j2ee.venue_management.DO;

import lombok.Data;

import java.security.Timestamp;
import java.util.*;
import com.j2ee.venue_management.Service.VenueService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
/**
 * @param: none
 * @description: 对应数据表的booking类
 * @author: YQ
 * @create: 2018-12-9
 **/
@Entity
@Data
@Table(name = "booking")


public class Booking {

    /* 订单ID */
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    /* 用户ID*/
    @Column(name = "userid")
    private Integer userid;


    /* 场馆ID*/
    @Column(name = "venueid")
    private Integer venueid;

    /*场馆名*/
    @Column(name = "venuename")
    private String venuename;

    /* 日期*/
    @Column(name = "date")
    private String date;

    /* 开始时间*/
    @Column(name = "time")
    private Integer time;

    /*时长*/
    @Column(name ="venueprice")
    private Double venueprice;

    @Column(name ="status")
    private String status;

    public Booking(){
        //setVenue();
    }

    /*用于查找某一天某一场馆的预约情况*/
    public Booking(Integer venueid, String date){
        //setVenue();
        this.venueid = venueid;
        this.date = date;
    }

    /*@Autowired
    private VenueService venueService;

    private void setVenue()
    {
        Venue venue=venueService.findOne(this.venueid);
        this.venuename=venue.name;
        this.venueprice=venue.price;
    }*/

}
