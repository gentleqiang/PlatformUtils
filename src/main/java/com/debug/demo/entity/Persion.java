package com.debug.demo.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

/**
* 类说明
* @author gentleman_qiang
* @version 创建时间：2020年5月14日 上午9:36:31
*/
@Data
public class Persion {

	@NotNull(message = "用户ID不能为空")
	private Long id;
	
	@NotNull(message = "用户账号不能为空")
	@Size(min = 6,max = 11,message = "账号长度必须是6-11个字符")
	private String account;
	
	@NotNull(message = "用户ID不能为空")
	@Size(min = 6,max = 11,message = "密码长度必须是6-11个字符")
	private String password;
	
	@NotNull(message = "用户ID不能为空")
	@Email(message = "邮箱格式不正确")
	private String mail;
}














































