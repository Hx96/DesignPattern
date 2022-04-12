package com.example.demo.java.base.javastar.second.homework;

import java.util.List;
import java.util.Vector;

import static com.example.demo.java.base.javastar.second.homework.Global.INIT_POINTS;


/**
 * @author 80307094
 */
public class User {

    /**
     * 用户ID
     */
    private Integer userID;

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", remainingPoints=" + remainingPoints +
                ", totalNum=" + totalNum.toString() +
                '}';
    }

    /**
     * 剩余可用的购买积分
     * Q: 有更好的数据结构吗？
     */
    private int remainingPoints = INIT_POINTS;

    User(int id){
        userID = id;
        this.totalNum = new Vector<>(1000);
    }

    public List<BuyRecord> getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(List<BuyRecord> totalNum) {
        this.totalNum = totalNum;
    }

    /**
     * 用户购买的商品记录
     * Q：选择一个更好的数据结构？
     */
    private List<BuyRecord> totalNum;

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public int  getRemainingPoints() {
        return remainingPoints;
    }

    public void setRemainingPoints(int remainingPoints) {
        this.remainingPoints = remainingPoints;
    }
}
