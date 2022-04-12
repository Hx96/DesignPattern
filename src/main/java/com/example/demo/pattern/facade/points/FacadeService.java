package com.example.demo.pattern.facade.points;

public class FacadeService {
  private QualifyService qualifyService = new QualifyService();
  private PaymentService paymentService = new PaymentService();
  private ShippingService shippingService = new ShippingService();

  public void sell(GiftInfo giftInfo) {
    if (qualifyService.isAvaliable(giftInfo)) {
      if (paymentService.pay(giftInfo)) {
        System.out.println("下单成功：" + shippingService.delivery(giftInfo));
      }
    }


  }

}
