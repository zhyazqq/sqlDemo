package com.onepage.mybatis.service.Impl;



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
		return mapper.finaAll();
	}
public List<Phone> findAllOracle() {
		System.out.println("service");
		return mapper.findAllOracle();
	}
 
	

}
