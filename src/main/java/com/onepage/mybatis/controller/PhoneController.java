package com.onepage.mybatis.controller;



import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.onepage.mybatis.entity.Phone;
import com.onepage.mybatis.service.PhoneService;

@RestController
@RequestMapping("/phone")
public class PhoneController {
	@Resource
	private PhoneService service;
	
	@RequestMapping(value = "/findAll",method = RequestMethod.GET)
	public List<Phone> findAll() {
		return service.findAll();
	}  
	@RequestMapping(value = "/insert",method = RequestMethod.POST)
	public void insert(@RequestBody Phone phone) {
		 service.insert(phone);
	} 
}
