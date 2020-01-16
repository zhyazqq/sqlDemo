package com.onepage.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Year;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Phone implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9210125633204416534L;
	private String name;
	private String type;
	private Year year;
	private String time;
	
	
	
	
	
}
