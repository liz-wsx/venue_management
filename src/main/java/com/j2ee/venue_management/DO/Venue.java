package com.j2ee.venue_management.DO;

import lombok.Data;

import javax.persistence.*;
/**
 * @param: none
 * @description: 对应数据表的Venue类
 * @author: YQ
 * @create: 2018-12-9
 **/
@Entity
@Data
@Table(name = "venue")
public class Venue {

    /* 场馆ID */
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    /* 用户ID */
    @Column(name = "UserID")
    private Integer UserID;

    /* 介绍*/
    @Column(name = "introduction")
    private String introduction;

    /* 名字 */
    @Column(name = "name")
    private String name;

    /* 邮箱 */
    @Column(name = "price")
    private Double price;

    public Venue(){
    }

}
