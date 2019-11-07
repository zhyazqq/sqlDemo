package com.onepage.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Phone implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9210125633204416534L;
	private Integer id;
	private String name;
	private String type;
	private String data;
	private String time;
	
	
}
