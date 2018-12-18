package com.j2ee.venue_management.DO;

import lombok.Data;
import java.util.*;

import javax.persistence.*;
import java.security.Timestamp;

/**
 * @param: none
 * @description: 对应数据表的news类
 * @author: YQ
 * @create: 2018-12-9
 **/
@Entity
@Data
@Table(name = "news")
public class News {

    /* 新闻ID */
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    /* 创建时间 */
    @Column(name = "time")
    private Timestamp time;

    /* 标题 */
    @Column(name = "title")
    private String title;

    /*内容*/
    @Column (name = "content")
    private String content;

    public News(){
    }

}
