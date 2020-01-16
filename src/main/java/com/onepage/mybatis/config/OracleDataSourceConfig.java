//package com.onepage.mybatis.config;
//
//import java.util.Properties;
//
//import javax.sql.DataSource;
//
//import org.apache.ibatis.mapping.DatabaseIdProvider;
//import org.apache.ibatis.mapping.VendorDatabaseIdProvider;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.annotation.MapperScan;
//import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
//@Configuration
//@MapperScan(basePackages = "com.onepage.mybatis.mapper.oracle",sqlSessionTemplateRef="SqtTwo")
//public class OracleDataSourceConfig {
//
//	@Value("${mybatis.mapper-locations}")
//	private String mapperLocations;
//	/*
//	 * @Value("${mybatis.mapper-location}") private String mapperLocationsOrcale;
//	 */
//
//
//@Bean(name="TwoDataSource")
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
//
//@Bean(name="TwoSqf")
//public SqlSessionFactory sqlSessionFactoryBeanOracle(@Qualifier("TwoDataSource") DataSource dataSource) throws Exception {
//    SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
//  
//    factoryBean.setDataSource(dataSource);
//    factoryBean.setVfs(SpringBootVFS.class);
//    System.out.println("two s");
//    factoryBean.setDatabaseIdProvider(this.databaseIdProviderOracle());
//		/*
//		 * if(this.databaseIdProviderOracle()!=null) {
//		 * factoryBean.getObject().getConfiguration().setDatabaseId(this.
//		 * databaseIdProviderOracle().getDatabaseId(this.dataSourceOrcale()));
//		 * 
//		 * }
//		 */
//    factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/mysql/*Mapper.xml"));
//    return factoryBean.getObject();
//}
//@Bean("SqtTwo")
//public SqlSessionTemplate jdbcTemplateOrcale(@Qualifier("TwoSqf")SqlSessionFactory sessionFactory){
//	System.out.println("two t");
//    return new SqlSessionTemplate(sessionFactory);
//}
//}