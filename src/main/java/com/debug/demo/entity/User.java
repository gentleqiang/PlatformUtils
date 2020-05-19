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

	public User() {
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", username=" + username + ", password=" + password + "]";
	}  
	
	
	
   
	
}
