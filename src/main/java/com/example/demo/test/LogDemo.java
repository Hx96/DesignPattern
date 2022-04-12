package com.example.demo.test;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * LOG4J
 * LogBac
 *
 * 调用日志抽象层
 * 每个日志框架都有自己的实现类
 * 
 *
 */
@Slf4j
public class LogDemo {
    public static void main(String[] args) {
        log.info("log4j2");
        Logger logger = LoggerFactory.getLogger(LogDemo.class);
        logger.info("LogBack");
    }
}
