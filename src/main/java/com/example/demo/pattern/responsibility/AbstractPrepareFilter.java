package com.example.demo.pattern.responsibility;

/**
 * 与主程序解耦，支持扩展责任链
 *
 * @author kyle
 * @date 2023/12/10
 */
public abstract class AbstractPrepareFilter {

    public static void main(String[] args) {
        PreparationList preparationList = new PreparationList();
        preparationList.setWashFace(true);
        preparationList.setWashHair(true);
        preparationList.setHaveBreakfast(true);

        Study study = new Study();

        AbstractPrepareFilter haveBreakfastFilter = new HaveBreakfastFilter(null);
        AbstractPrepareFilter washFaceFilter = new WashFaceFilter(haveBreakfastFilter);
        AbstractPrepareFilter washHairFilter = new WashHairFilter(washFaceFilter);

        washHairFilter.doFilter(preparationList, study);
    }

    private AbstractPrepareFilter nextPrepareFilter;

    public AbstractPrepareFilter(AbstractPrepareFilter nextPrepareFilter) {
        this.nextPrepareFilter = nextPrepareFilter;
    }

    public void doFilter(PreparationList preparationList, Study study) {
        prepare(preparationList);

        if (nextPrepareFilter == null) {
            study.study();
        } else {
            nextPrepareFilter.doFilter(preparationList, study);
        }
    }

    public abstract void prepare(PreparationList preparationList);


    public static class Study {

        public void study() {
            System.out.println("学习");
        }

    }

    public static class WashHairFilter extends AbstractPrepareFilter {

        public WashHairFilter(AbstractPrepareFilter nextPrepareFilter) {
            super(nextPrepareFilter);
        }

        @Override
        public void prepare(PreparationList preparationList) {
            if (preparationList.isWashHair()) {
                System.out.println("洗头");
            }

        }

    }

    public static class HaveBreakfastFilter extends AbstractPrepareFilter {

        public HaveBreakfastFilter(AbstractPrepareFilter nextPrepareFilter) {
            super(nextPrepareFilter);
        }

        @Override
        public void prepare(PreparationList preparationList) {
            if (preparationList.isHaveBreakfast()) {
                System.out.println("吃早餐");
            }

        }

    }


    public static class WashFaceFilter extends AbstractPrepareFilter {

        public WashFaceFilter(AbstractPrepareFilter nextPrepareFilter) {
            super(nextPrepareFilter);
        }

        @Override
        public void prepare(PreparationList preparationList) {
            if (preparationList.isWashFace()) {
                System.out.println("洗脸");
            }

        }

    }


    public static class PreparationList {

        /**
         * 是否洗脸
         */
        private boolean washFace;

        /**
         * 是否洗头
         */
        private boolean washHair;

        /**
         * 是否吃早餐
         */
        private boolean haveBreakfast;

        public boolean isWashFace() {
            return washFace;
        }

        public void setWashFace(boolean washFace) {
            this.washFace = washFace;
        }

        public boolean isWashHair() {
            return washHair;
        }

        public void setWashHair(boolean washHair) {
            this.washHair = washHair;
        }

        public boolean isHaveBreakfast() {
            return haveBreakfast;
        }

        public void setHaveBreakfast(boolean haveBreakfast) {
            this.haveBreakfast = haveBreakfast;
        }

        @Override
        public String toString() {
            return "ThingList [washFace=" + washFace + ", washHair=" + washHair + ", haveBreakfast=" + haveBreakfast + "]";
        }

    }

}