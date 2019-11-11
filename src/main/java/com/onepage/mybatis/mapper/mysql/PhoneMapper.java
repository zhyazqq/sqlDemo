package com.onepage.mybatis.mapper.mysql;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Qualifier;

import com.onepage.mybatis.entity.Phone;


public interface PhoneMapper {
	@Qualifier("SqtOne")
	List<Phone> finaAll();
}
