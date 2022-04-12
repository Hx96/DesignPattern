package com.example.demo.java.base.javastar.second.homework;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * @author 80307094
 */
@Data
@AllArgsConstructor
public class BuyRecord {
    /**
     * 时间戳
     */
    private Date time_stamp;
    /**
     * 购买价格
     */
    private int buyPrice;
    /**
     * 购买商品编码
     */
    private int goodCode;
}
