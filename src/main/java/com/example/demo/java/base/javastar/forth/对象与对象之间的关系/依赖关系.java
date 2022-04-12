package com.example.demo.java.base.javastar.forth.对象与对象之间的关系;

public class 依赖关系 {

}


class Coach {
  public void teach(Player player) {
    player.play();
  }
}

class Player {
  public void play() {
    System.out.println("打球最重要的就是动作要快，姿势要帅！");
    System.out.println("教练怎么教我就怎么打！");
    System.out.println("重要的是要风靡万千少女和老太太！");
  }
}
