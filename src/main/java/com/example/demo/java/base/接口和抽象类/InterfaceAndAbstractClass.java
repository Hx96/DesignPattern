package com.example.demo.java.base.接口和抽象类;

/**
 * @author XingHuang
 */
public class InterfaceAndAbstractClass {

    /**
     *
     */
    abstract class AbstractClass{
        /**
         * 被子类所继承 子类实现area来计算面积 返回值 double
         * @return
         */
        abstract public double area();


    }


    /**
     * 接口 接口变量自动定义 public static final
     * 抽象类的成员变量可以是各种类型的
     */
    interface DefaultDefine{
        // idea 会变 黑
        public static final int a = 0;

    }

}
