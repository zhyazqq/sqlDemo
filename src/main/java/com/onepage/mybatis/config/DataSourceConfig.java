package com.onepage.mybatis.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.mapping.DatabaseIdProvider;
import org.apache.ibatis.mapping.VendorDatabaseIdProvider;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.core.JdbcTemplate;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
@Configuration

public class DataSourceConfig {

	@Value("${mybatis.mapper-locations}")
	private String mapperLocations;
	/*
	 * @Value("${mybatis.mapper-location}") private String mapperLocationsOrcale;
	 */


@Primary
@Bean
@ConfigurationProperties(prefix = "spring.datasource.druid")
public DataSource dataSourceMysql(){
	System.out.println("one d");
    return DruidDataSourceBuilder.create().build();
}
  @Primary
  @Bean
  public DatabaseIdProvider databaseIdProvider(){ 
	 DatabaseIdProvider databaseIdProvider = new VendorDatabaseIdProvider();
  Properties p = new Properties(); 
  p.setProperty("MySQL","mysql"); 
  p.setProperty("Oracle", "oracle"); 
  databaseIdProvider.setProperties(p); 
  System.out.println(databaseIdProvider.toString()+"00000000000000");
  return databaseIdProvider; 
  }
	
	

@Primary
@Bean
public SqlSessionFactoryBean sqlSessionFactoryBeanMySQL() throws Exception {
    SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
    factoryBean.setDataSource(this.dataSourceMysql());
    System.out.println("one s");
    factoryBean.setVfs(SpringBootVFS.class);
    
    factoryBean.setDatabaseIdProvider(this.databaseIdProvider());
    factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/mysql/*.xml"));
//    factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(mapperLocations));
    return factoryBean;
}
@Primary
@Bean
public JdbcTemplate jdbcTemplateMysql (){
	System.out.println("one t");
    return new JdbcTemplate(this.dataSourceMysql());
}

}