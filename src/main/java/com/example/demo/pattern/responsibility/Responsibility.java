package com.example.demo.pattern.responsibility;

import java.util.Arrays;
import java.util.List;

public class Responsibility {

    public static void main(String[] args) {
        Dating dating = new Dating();

        Hair hair = new Hair();
        Clothing clothing = new Clothing();
        Clothing clothing1 = new Clothing();
        hair.build(Arrays.asList(clothing, clothing1));

        hair.handle(dating);
    }

    public static class Dating {
        private boolean hair = true;
        private boolean clothing = true;

        public boolean isHair() {
            return hair;
        }

        public boolean isClothing() {
            return clothing;
        }
    }

    public static abstract class AbstractDateChain {
        protected AbstractDateChain nextStep;

        public void handle(Dating dating) {
            handDating(dating);
            if(nextStep != null) {
                nextStep.handle(dating);
            }
        }
        /**
         * 处理请求
         * @param dating
         */
        abstract void handDating(Dating dating);

        public void setNextStep(AbstractDateChain abstractDateChain) {
            this.nextStep = abstractDateChain;
        }

        public void build(List<AbstractDateChain> abstractDateChains) {
            this.nextStep = abstractDateChains.get(0);
            for (int i = 0; i < abstractDateChains.size()-1; i++) {
                abstractDateChains.get(i).setNextStep(abstractDateChains.get(i+1));
            }
        }
    }

    public static class Hair extends AbstractDateChain {

        @Override
        void handDating(Dating dating) {
            if(dating.isHair()) {
                System.out.println("I Washing Hair");
            }
        }
    }

    public static class Clothing extends AbstractDateChain {

        @Override
        void handDating(Dating dating) {
            if(dating.isClothing()) {
                System.out.println("I Were Shinning Clothing!");
            }
        }
    }
}
