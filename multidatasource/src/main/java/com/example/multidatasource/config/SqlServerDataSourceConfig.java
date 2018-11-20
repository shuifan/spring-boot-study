package com.example.multidatasource.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @author fandong
 * @create 2018/11/20
 */
@Configuration
@MapperScan(basePackages = SqlServerDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "sqlserverSqlSessionFactory")
public class SqlServerDataSourceConfig {

    static final String PACKAGE = "com.example.multidatasource.dao.sqlserver";
    static final String MAPPER_LOCATION = "classpath:com/example/multidatasource/dao/sqlserver/**/*.xml";

    @Value("${sqlserver.datasource.url}")
    private String url;

    @Value("${sqlserver.datasource.username}")
    private String user;

    @Value("${sqlserver.datasource.password}")
    private String password;

    @Value("${sqlserver.datasource.driverClassName}")
    private String driverClass;

    @Bean(name = "sqlserverDataSource")
    public DataSource sqlserverDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean(name = "sqlserverTransactionManager")
    public DataSourceTransactionManager sqlserverTransactionManager() {
        return new DataSourceTransactionManager(sqlserverDataSource());
    }

    @Bean(name = "sqlserverSqlSessionFactory")
    public SqlSessionFactory sqlserverSqlSessionFactory(@Qualifier("sqlserverDataSource") DataSource dataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(SqlServerDataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}
