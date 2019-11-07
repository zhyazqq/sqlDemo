package com.onepage.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.onepage.mybatis.entity.Phone;

@Mapper
public interface PhoneMapper {
	List<Phone> finaAll();
	List<Phone> findAllOracle();
}
