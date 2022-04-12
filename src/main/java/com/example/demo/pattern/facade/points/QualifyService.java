package com.example.demo.pattern.facade.points;

/**
 * 校验
 *
 * @author 35762
 */
public class QualifyService {
  public boolean isAvaliable(GiftInfo giftInfo) {
    System.out.println("校验" + giftInfo.getName() + "成功");
    return true;
  }
}
