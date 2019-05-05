package com.memebrary.util;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource({ "classpath:application.properties" })
public class DatabaseConfig {

	@Bean
	@Primary
	@ConfigurationProperties("spring.datasource")
	public DataSource dataSource(DataSourceProperties properties) {
		return properties.initializeDataSourceBuilder().build();
	}
}