package com.example.demo.pattern.prototype.demo;

/**
 * @author XingHuang
 */
public class Client {
    public static void main(String[] args) {
        ExamPaper examPaper = new ExamPaper();
        examPaper.setId1("1");
        examPaper.setId2("2");
        examPaper.setId3("3");
        examPaper.setLeaveTime("4");
        ExamPaper paper = (ExamPaper) BeanUtils.copy(examPaper);
        System.out.println(paper);
    }
}
