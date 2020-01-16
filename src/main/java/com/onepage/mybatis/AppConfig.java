package com.onepage.mybatis;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
@Configuration
public class AppConfig {

	
	@Bean
	public DataSource dataSource() throws Exception {
		HikariConfig config =new HikariConfig();
		config.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/zqqd1?useUnicode=true&useSSL=false&characterEncoding=utf8&useSSL=true&serverTimezone=UTC");
		config.setUsername("root");
		config.setPassword("123456");
		config.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return new HikariDataSource(config);
	}
}
