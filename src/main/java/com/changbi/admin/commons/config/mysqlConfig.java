package com.changbi.admin.commons.config;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
@Slf4j
@AllArgsConstructor
public class mysqlConfig {

    @Autowired
    private ApplicationContext applicationContext;

    @Value("${spring.datasource-mysql.mapper-location}")
    private String mapperLocation;

    @Bean(name = "mysqlDataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource-mysql")
    public DataSource mysqlDataSource() {
        DataSource dataSource = DataSourceBuilder.create().build();
        log.info("Datasource : {}", dataSource);
        return dataSource;
    }

    @Bean(name = "mysqlSqlSessionFactory")
    @Primary
    public SqlSessionFactory mysqlSqlSessionFactory(@Qualifier("mysqlDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources(mapperLocation));

//		Properties properties = new Properties();
//		properties.put("mapUnderscoreToCamelCase", true);
//		sqlSessionFactoryBean.setConfigurationProperties(properties);

        //Mybatis config파일 위치
        /*Resource myBatisConfig = new PathMatchingResourcePatternResolver().getResource(configPath);
        sqlSessionFactoryBean.setConfigLocation(myBatisConfig);*/

        return sqlSessionFactoryBean.getObject();
    }

    @Bean(name = "mysqlSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate mysqlSqlSessionFactory(@Qualifier("mysqlSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
