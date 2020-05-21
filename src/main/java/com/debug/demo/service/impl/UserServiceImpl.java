package com.debug.demo.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.debug.demo.api.request.LogDto;
import com.debug.demo.api.status.BaseResponse;
import com.debug.demo.entity.User;
import com.debug.demo.mapper.UserMapper;
import com.debug.demo.service.UserManager;


/**
* 类说明
* @author gentleman_qiang
* @version 创建时间：2020年5月21日 上午10:14:11
*/
public class UserServiceImpl implements UserManager{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public BaseResponse login(LogDto logDto) {
		User user = new User();
		BeanUtils.copyProperties(logDto, user);
		//TODO 调用数据库，开始处理业务逻辑
		userMapper.addUser(user);
		return null;
	}

}
