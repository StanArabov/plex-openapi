package com.cleverpine.plex.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.HashMap;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = "com.cleverpine.plex.repository.legacy",
        entityManagerFactoryRef = "deviceEntityManager",
        transactionManagerRef = "deviceTransactionManager"
)
public class SQLiteConfiguration {
    @Autowired
    private Environment env;

    @Bean
    public LocalContainerEntityManagerFactoryBean deviceEntityManager() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(deviceDataSource());
        em.setPackagesToScan("com.cleverpine.plex.entity.legacy");

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);

        HashMap<String, Object> properties = new HashMap<>();
//        properties.put("hibernate.hbm2ddl.auto",
//                env.getProperty("second-datasource.datasource.jpa.hibernate.hbm2ddl.auto"));
        properties.put("hibernate.dialect", env.getProperty("second-datasource.datasource.jpa.hibernate.database-platform"));
        em.setJpaPropertyMap(properties);

        return em;
    }

    @Bean
    @ConfigurationProperties(prefix = "second-datasource.datasource")
    public DataSource deviceDataSource() {
        return DataSourceBuilder.create()
                .driverClassName("org.sqlite.JDBC")
                .url("jdbc:sqlite:/Users/stanislavarabov/Downloads/5.db")
                .build();
    }

    @Bean
    public PlatformTransactionManager deviceTransactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(deviceEntityManager().getObject());
        return transactionManager;
    }
}
