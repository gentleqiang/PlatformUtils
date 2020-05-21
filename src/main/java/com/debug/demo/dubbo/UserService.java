package com.debug.demo.dubbo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import com.debug.demo.api.request.LogDto;
import com.debug.demo.api.service.IUserService;
import com.debug.demo.api.status.BaseResponse;
import com.debug.demo.api.status.StatusCode;
import com.debug.demo.service.UserManager;

/**
* 类说明
* @author gentleman_qiang
* @version 创建时间：2020年5月21日 上午10:02:36
*/
public class UserService implements IUserService{

	private static final Logger log = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
    private UserManager userManager;
	
	@Override
	public BaseResponse login(LogDto logDto) {
		BaseResponse response = new BaseResponse(StatusCode.Suceess);
		if(StringUtils.isEmpty(logDto.getPassword()) || StringUtils.isEmpty(logDto.getPassword())) {
			 response = new BaseResponse(StatusCode.InvalidArguments);
		}
		log.info("----------dubbo服务开始调用登录接口--------");
		try {
			log.info("----------开始调用服务--------");
			userManager.login(logDto);
		} catch (Exception e) {
			response = new BaseResponse(StatusCode.Fail.getCode(),e.getMessage());
			log.error("-----dubbo服务，调用登录接口发生异常:{}",logDto);
		}
		return response;
	}

}
