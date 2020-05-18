package com.debug.demo.entity;

import java.io.Serializable;

import lombok.Data;

/**
* 类说明
* @author gentleman_qiang
* @version 创建时间：2020年5月11日 下午1:55:31
*/
@Data
public class User implements Serializable{
    private Integer user_id;
    private String  username;
    private String  password;
    
	public User(Integer user_id, String username, String password) {
		this.user_id = user_id;
		this.username = username;
		this.password = password;
	}    
   
	
}
