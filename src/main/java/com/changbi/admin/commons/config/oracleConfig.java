package com.changbi.admin.commons.config;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(value = "com.changbi.admin.mapper.oracle",
        sqlSessionFactoryRef = "oracleSqlSessionFactory")
@Slf4j
@AllArgsConstructor
public class oracleConfig {

    private final ApplicationContext applicationContext;

    @Value("${spring.datasource-oracle.mapper-location}")
    private String mapperLocation;
}
