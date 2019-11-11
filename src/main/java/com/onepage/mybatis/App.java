package com.onepage.mybatis;

import java.util.Properties;

import org.apache.ibatis.mapping.DatabaseIdProvider;
import org.apache.ibatis.mapping.VendorDatabaseIdProvider;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan(basePackages = "com.onepage.mybatis.mapper")
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	  @Bean
	  public DatabaseIdProvider databaseIdProvider(){ 
	  DatabaseIdProvider databaseIdProvider = new VendorDatabaseIdProvider();
	  Properties p = new Properties(); 
	  p.setProperty("MySQL","mysql"); 
	  p.setProperty("Oracle", "oracle"); 
	  databaseIdProvider.setProperties(p); 
	  return databaseIdProvider; 
	  }

}
