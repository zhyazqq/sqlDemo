package com.onepage.mybatis;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.mapping.DatabaseIdProvider;
import org.apache.ibatis.mapping.VendorDatabaseIdProvider;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.core.JdbcTemplate;

//import com.alibaba.druid.pool.DruidDataSourceFactory;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
@SpringBootApplication
//@MapperScan(basePackages = "com.onepage.mybatis.mapper")
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
	
	
//	@Value("${mybatis.mapper-locations}")
//	private String mapperLocations;
//	@Value("${mybatis.mapper-location}")
//	private String mapperLocationsOrcale;
//
//
//@Primary
//@Bean(name="one")
//@Qualifier("one")
//@ConfigurationProperties(prefix = "spring.datasource.druid.one")
//public DataSource dataSourceMysql(){
//	System.out.println("one d");
//    return DruidDataSourceBuilder.create().build();
//}
//  @Primary
//  @Bean
//  public DatabaseIdProvider databaseIdProvider(){ 
//	 DatabaseIdProvider databaseIdProvider = new VendorDatabaseIdProvider();
//  Properties p = new Properties(); 
//  p.setProperty("MySQL","mysql"); 
//  p.setProperty("Oracle", "oracle"); 
// 
//  databaseIdProvider.setProperties(p); 
//  System.out.println(databaseIdProvider.toString()+"00000000000000");
//  return databaseIdProvider; 
//  }
//	
//	
//
//@Primary
//@Bean
//public SqlSessionFactoryBean sqlSessionFactoryBeanMySQL() throws Exception {
//    SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
//    factoryBean.setDataSource(dataSourceMysql());
//    System.out.println("one s");
//    factoryBean.setVfs(SpringBootVFS.class);
//    
//    factoryBean.setDatabaseIdProvider(databaseIdProvider());
//    factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(mapperLocations));
//    return factoryBean;
//}
//@Primary
//@Bean(name="one")
//public JdbcTemplate jdbcTemplateMysql(@Qualifier("one") DataSource dataSourceMysql ){
//	System.out.println("one t");
//    return new JdbcTemplate(dataSourceMysql);
//}
//@Bean(name = "two")
//@Qualifier("two")
//@ConfigurationProperties(prefix ="spring.datasource.druid.two")
//public DataSource dataSourceOrcale(){
//	System.out.println("two d");
//    return DruidDataSourceBuilder.create().build();
//}
//
//@Bean
//public DatabaseIdProvider databaseIdProviderOracle(){ 
//	  DatabaseIdProvider databaseIdProvider = new VendorDatabaseIdProvider(); 
//	  Properties p = new Properties(); 
//	  
//	  p.setProperty("MySQL","mysql"); 
//	  p.setProperty("Oracle", "oracle"); 
//	  databaseIdProvider.setProperties(p); return databaseIdProvider; 
//	  }
//@Bean(name="two")
//public JdbcTemplate jdbcTemplateOrcale(@Qualifier("two")DataSource dataSourceOrcale){
//	System.out.println("two t");
//    return new JdbcTemplate(dataSourceOrcale);
//}
//@Bean
//public SqlSessionFactoryBean sqlSessionFactoryBeanOracle() throws Exception {
//    SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
//    factoryBean.setDataSource(dataSourceOrcale());
//    factoryBean.setVfs(SpringBootVFS.class);
//    System.out.println("two s");
//    factoryBean.setDatabaseIdProvider(databaseIdProvider());
//    factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(mapperLocations));
//    return factoryBean;
//}
}
