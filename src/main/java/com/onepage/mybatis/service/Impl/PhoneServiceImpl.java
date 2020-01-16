package com.onepage.mybatis.service.Impl;



import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.time.Year;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import com.onepage.mybatis.entity.Phone;
import com.onepage.mybatis.mapper.PhoneMapper;
import com.onepage.mybatis.service.PhoneService;



@Service
public class PhoneServiceImpl implements PhoneService {
	@Resource
	private PhoneMapper mapper;

public List<Phone> findAll() {
		// TODO Auto-generated method stub
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try(Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:ORACLE","zqq","123456")){
		
		return mapper.finaAll();
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
		return mapper.finaAll();
	}

@Override
public void insert(Phone phone) {
	Integer date=new Date(System.currentTimeMillis()).getYear();
	date=date-100;
	System.out.println(date);
	Year year=Year.of(date);
	System.out.println(year+"year");
	phone.setYear(year);
	System.out.println(phone);
	mapper.insert(phone);
	
}
}
