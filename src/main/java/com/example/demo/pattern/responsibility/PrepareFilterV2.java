package com.example.demo.pattern.responsibility;

import com.example.demo.pattern.responsibility.AbstractPrepareFilter.PreparationList;
import com.example.demo.pattern.responsibility.AbstractPrepareFilter.Study;

import java.util.ArrayList;
import java.util.List;


/**
 * @author kyle
 */
public class PrepareFilterV2 {

    public static void main(String[] args) {
        Study study = new Study();
        PreparationList preparationList = new PreparationList();
        preparationList.setWashFace(false);
        preparationList.setWashHair(true);

        FilterChain filterChain = new FilterChain(study);
        filterChain.addFilter(new WashHairFilter());
        filterChain.addFilter(new WashFaceFilter());

        filterChain.doFilter(preparationList, filterChain);
    }

    public static class FilterChain extends AbstractPrepareFilter {
        private Study study;

        private int pos=0;

        public FilterChain(Study study) {
            this.study = study;
        }

        private List<AbstractPrepareFilter> studyPrepareFilters;

        public void addFilter(AbstractPrepareFilter studyPrepareFilter) {
            if (studyPrepareFilters == null) {
                studyPrepareFilters = new ArrayList<AbstractPrepareFilter>();
            }

            studyPrepareFilters.add(studyPrepareFilter);
        }

        @Override
        public void doFilter(PreparationList thingList, FilterChain filterChain) {
            // 所有过滤器执行完毕
            if (pos == studyPrepareFilters.size()) {
                study.study();
                return;
            }

            System.out.println(pos);
            studyPrepareFilters.get(pos++).doFilter(thingList, filterChain);
        }

    }

    public static class WashHairFilter extends AbstractPrepareFilter {

        @Override
        public void doFilter(PreparationList preparationList, FilterChain filterChain) {
            if (preparationList.isWashHair()) {
                System.out.println("洗完头发");
            }

            filterChain.doFilter(preparationList, filterChain);
        }

    }

    public static class WashFaceFilter extends AbstractPrepareFilter {

        @Override
        public void doFilter(PreparationList preparationList, FilterChain filterChain) {
            if (preparationList.isWashFace()) {
                System.out.println("洗完脸");
            }

            filterChain.doFilter(preparationList, filterChain);
        }

    }

    public static abstract class AbstractPrepareFilter {


        public void doFilter(PreparationList preparationList, FilterChain filterChain) {
        }
    }
}
