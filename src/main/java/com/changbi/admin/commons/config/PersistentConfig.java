/*
package com.changbi.admin.commons.config;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class PersistentConfig {

    @Autowired
    private ApplicationContext applicationContext;


    @Bean
    @Qualifier("mysqlDataSource")
    @ConfigurationProperties(prefix = "spring.datasource-mysql")
    public DataSource mysqlDataSource(){
        return DataSourceBuilder.create()
                .type(HikariDataSource.class)
                .build();
    }


    @Bean
    @Qualifier("oracleDataSource")
    @ConfigurationProperties(prefix = "spring.datasource-oracle")
    public DataSource oracleDataSource(){
        return DataSourceBuilder.create()
                .type(HikariDataSource.class)
                .build();
    }

    @Bean
    @Primary
    public SqlSessionFactory mysqlSqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(mysqlDataSource());
        */
/*
        * VFS (Virtual File System)
        * 가상의 파일 시스템을 의미하는 용어로 파일 등 시스템 리소스에 접근할 때 이용하는 클래스다.
        * setVfs안에 아무런 지정을 하지 않으면 DefaultVFS라는 구현체가 사용되는데
        * IDE 위에서 구동될 때 target 디렉토리 이하 classes 파일들에 문제없이 접근할 수 있으나
        * Spring Boot 프로젝트로 배포한 jar에서는 형태가 달라 classes에 접근이 되지않아 alias들이 등록되지 않는다.
        *//*

        factoryBean.setVfs(SpringBootVFS.class);
        //factoryBean.setConfigLocation(applicationContext.getResource("classpath:mybatis/mybatis-config.xml"));
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource[] resource = resolver.getResources("classpath:mapper/mysql/*Mapper.xml");
        factoryBean.setMapperLocations(resource);
        return factoryBean.getObject();
    }

    @Bean
    public SqlSessionFactory oracleSqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(oracleDataSource());
        factoryBean.setVfs(SpringBootVFS.class);
        //factoryBean.setConfigLocation(applicationContext.getResource("classpath:mybatis/mybatis-config.xml"));
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource[] resource = resolver.getResources("classpath:mapper/oracle/*Mapper.xml");
        factoryBean.setMapperLocations(resource);
        return factoryBean.getObject();
    }

    @Bean
    public JdbcTemplate mysqlJdbcTemplate(@Qualifier("mysqlDataSource") DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

    @Bean JdbcTemplate oracleJdbcTemplate(@Qualifier("oracleDataSource") DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
}
*/
