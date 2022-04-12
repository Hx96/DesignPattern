//package com.example.demo.test;
//
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//
///**
// * @author 黄星80307094
// * @date 2021/8/18 16:40
// */
//public class Readxlsx {
//    public static void main(String[] args) {
//        try {
//            //创建工作簿对象
//            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(new FileInputStream("D:\\ProgramFiles\\ZHClient\\file\\分行迁移至CDH实验室-个人实验室项目管理员名单收集.xlsx"));
//            //获取工作簿下sheet的个数
//            int sheetNum = xssfWorkbook.getNumberOfSheets();
//            System.out.println("该excel文件中总共有："+sheetNum+"个sheet");
//            //遍历工作簿中的所有数据
//            for(int i = 0;i<sheetNum;i++) {
//                //读取第i个工作表
//                System.out.println("读取第"+(i+1)+"个sheet");
//                XSSFSheet sheet = xssfWorkbook.getSheetAt(i);
//                //获取最后一行的num，即总行数。此处从0开始
//                int maxRow = sheet.getLastRowNum();
//                for (int row = 1; row <= maxRow; row++) {
//                    //获取最后单元格num，即总单元格数 ***注意：此处从1开始计数***
//                    String branchNumber = String.valueOf(sheet.getRow(row).getCell(2));
////                    String s = branchNumber.substring(0,3);
//                    String branchId = String.valueOf(sheet.getRow(row).getCell(3)).split("/")[1];
//                    // UPDATE  cms_tenant SET branch_admin_id = '276465' WHERE bbk_id = 110
//                    System.out.println("UPDATE cms_tenant SET branch_admin_id = '"+ branchId +"' WHERE org_name = '" + branchNumber + "';");
//                }
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//}
