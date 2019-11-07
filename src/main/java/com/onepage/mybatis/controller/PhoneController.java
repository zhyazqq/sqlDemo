package com.onepage.mybatis.controller;



import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.onepage.mybatis.entity.Phone;
import com.onepage.mybatis.service.PhoneService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/phone")
public class PhoneController {
	@Resource
	private PhoneService service;
	
	@RequestMapping(value = "/findAll",method = RequestMethod.GET)
	public List<Phone> findAll() {
		
		return service.findAll();
	}
	@RequestMapping(value = "/findAllO",method = RequestMethod.GET)
	public List<Phone> findAllOracle() {
		System.out.println("controller");
		return service.findAllOracle();
	}
   
}
