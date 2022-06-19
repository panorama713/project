package com.example.trip_site_backend.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * packageName : com.example.trip_site_backend.models
 * fileName : Items
 * author : gim-yeong-geun
 * date : 2022/06/19
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/06/19         gim-yeong-geun          최초 생성
 */
@Getter
@Setter
@ToString
public class Items {

    private Long id;
    private String title;
    private String description;
    private int price;
    private boolean saleYn;
    private boolean deleteYn;
    private Date insertTime;
    private Date updateTime;
    private Date deleteTime;

}
