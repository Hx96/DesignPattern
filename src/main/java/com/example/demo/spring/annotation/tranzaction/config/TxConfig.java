package com.example.demo.spring.annotation.tranzaction.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
public class TxConfig {

    @Bean
    public DataSource dataSource() throws PropertyVetoException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setUser("root");
        comboPooledDataSource.setPassword("12344321");
        comboPooledDataSource.setDriverClass("com.mysql.jdbc.driver");
        comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        return comboPooledDataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() throws Exception {
        // 多次调用都是加组件
        return new JdbcTemplate(dataSource());
    }
}
