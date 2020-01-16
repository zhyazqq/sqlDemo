package com.onepage.mybatis.service;

import java.util.List;

import com.onepage.mybatis.entity.Phone;



public interface PhoneService {
	List<Phone> findAll();
	void insert(Phone phone);
}
