package com.example.demo.pattern.facade.points;

/**
 * 支付服务类
 * @author 35762
 */
public class PaymentService {

  public boolean pay(GiftInfo giftInfo) {
    System.out.println("扣减" + "成功" );
    return true;
  }

}
